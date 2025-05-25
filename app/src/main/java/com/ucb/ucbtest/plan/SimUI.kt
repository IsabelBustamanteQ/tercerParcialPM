package com.ucb.ucbtest.plan

import android.Manifest
import android.content.pm.PackageManager
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.*
import com.ucb.ucbtest.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimUI(onBackPressed: () -> Unit) {
    val context = LocalContext.current
    var phone by remember { mutableStateOf("") }
    var latitude by remember { mutableStateOf("") }
    var longitude by remember { mutableStateOf("") }
    var markerPosition by remember { mutableStateOf<LatLng?>(null) }
    var hasLocationPermission by remember { mutableStateOf(false) }
    var showThankYouDialog by remember { mutableStateOf(false) }

    val fusedLocationClient = LocationServices.getFusedLocationProviderClient(context)

    val initialPosition = LatLng(-17.3895, -66.1568)
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(initialPosition, 14f)
    }
    val error=stringResource(R.string.SimError)
    val mapsPermissionMsg=stringResource(R.string.mapsPermissionMsg)
    // Solicitud de permisos
    val permissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        hasLocationPermission = isGranted
        if (isGranted) {
            fusedLocationClient.lastLocation.addOnSuccessListener { location ->
                location?.let {
                    val current = LatLng(it.latitude, it.longitude)
                    markerPosition = current
                    latitude = it.latitude.toString()
                    longitude = it.longitude.toString()
                    cameraPositionState.move(CameraUpdateFactory.newLatLngZoom(current, 16f))
                }
            }
        } else {
            Toast.makeText(context, mapsPermissionMsg, Toast.LENGTH_SHORT).show()
        }
    }

    LaunchedEffect(Unit) {
        val permissionState = ContextCompat.checkSelfPermission(
            context, Manifest.permission.ACCESS_FINE_LOCATION
        )
        if (permissionState == PackageManager.PERMISSION_GRANTED) {
            hasLocationPermission = true
            fusedLocationClient.lastLocation.addOnSuccessListener { location ->
                location?.let {
                    val current = LatLng(it.latitude, it.longitude)
                    markerPosition = current
                    latitude = it.latitude.toString()
                    longitude = it.longitude.toString()
                    cameraPositionState.move(CameraUpdateFactory.newLatLngZoom(current, 16f))
                }
            }
        } else {
            hasLocationPermission = false
            permissionLauncher.launch(Manifest.permission.ACCESS_FINE_LOCATION)
        }
    }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(stringResource(R.string.SimLbl)) },
                navigationIcon = {
                    IconButton(onClick = { onBackPressed() }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Botón para volver"
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .padding(16.dp)
                .fillMaxSize()
        ) {
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = stringResource(R.string.Simtitle),
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFF36C5D)
            )

            OutlinedTextField(
                value = phone,
                onValueChange = {
                    phone = it.take(20)  // Limita a 20 caracteres
                },
                label = { Text(stringResource(R.string.phoneLbl)) },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true
            )


            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = latitude,
                onValueChange = {},
                label = { Text(stringResource(R.string.LatitudeLbl)) },
                modifier = Modifier.fillMaxWidth(),
                enabled = false
            )

            OutlinedTextField(
                value = longitude,
                onValueChange = {},
                label = { Text(stringResource(R.string.LongitudeLbl)) },
                modifier = Modifier.fillMaxWidth(),
                enabled = false
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(stringResource(R.string.mapsLbl), style = MaterialTheme.typography.labelLarge)

            Spacer(modifier = Modifier.height(8.dp))

            GoogleMap(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp),
                cameraPositionState = cameraPositionState,
                properties = MapProperties(isMyLocationEnabled = hasLocationPermission),
                uiSettings = MapUiSettings(
                    zoomControlsEnabled = false,
                    zoomGesturesEnabled = true,
                    myLocationButtonEnabled = hasLocationPermission
                ),
                onMapClick = { latLng ->
                    markerPosition = latLng
                    latitude = latLng.latitude.toString()
                    longitude = latLng.longitude.toString()
                }
            ) {
                markerPosition?.let {
                    Marker(
                        state = MarkerState(position = it),
                        title = stringResource(R.string.markerLbl)
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {
                    if (phone.isNotBlank() && latitude.isNotBlank() && longitude.isNotBlank()) {
                        showThankYouDialog = true
                    } else {
                        Toast.makeText(
                            context,
                            error,
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF36C5D)),
                shape = RoundedCornerShape(50)
            ) {
                Text(stringResource(R.string.sendBtn))
            }
            if (showThankYouDialog) {
                AlertDialog(
                    onDismissRequest = { showThankYouDialog = false },
                    title = { Text(stringResource(R.string.thanks)) },
                    text = { Text(stringResource(R.string.ThanksMsg)) },
                    confirmButton = {
                        TextButton(
                            onClick = { showThankYouDialog = false }
                        ) {
                            Text(stringResource(R.string.accept))
                        }
                    }
                )
            }
        }
    }
}
