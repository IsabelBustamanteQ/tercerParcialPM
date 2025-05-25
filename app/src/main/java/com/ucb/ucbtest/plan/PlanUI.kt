package com.ucb.ucbtest.plan

import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.SizeTransform
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.with
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.google.android.gms.common.internal.StringResourceValueReader
import com.ucb.ucbtest.R
import com.ucb.ucbtest.socialpack.Facebook
import com.ucb.ucbtest.socialpack.Instagram
import com.ucb.ucbtest.socialpack.Messenger
import com.ucb.ucbtest.socialpack.Snapchat
import com.ucb.ucbtest.socialpack.SocialPack
import com.ucb.ucbtest.socialpack.Telegram
import com.ucb.ucbtest.socialpack.Twitterx
import com.ucb.ucbtest.socialpack.Whatsapp
import com.ucb.ucbtest.socialpack.Whatsapp2

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun PlanUI(
    planViewModel: PlanViewModel = hiltViewModel(),
    navController: NavHostController,
    onSuccess: () -> Unit
) {
    val context = LocalContext.current
    LaunchedEffect(Unit) {
        planViewModel.fetchPlans()
        planViewModel.getNumber()
    }
    val number by planViewModel.phoneNumber.collectAsState()
    val uiState by planViewModel.flow.collectAsState()
    var currentIndex by remember { mutableStateOf(0) }


    val message = stringResource(id = R.string.WhatsAppMessage)
    val error= stringResource(R.string.WhatsAppError)
    when (val ui = uiState) {
        is PlanViewModel.PlanState.Init -> {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator()
            }
        }

        is PlanViewModel.PlanState.Successful -> {
            val plans = ui.list

            Box(modifier = Modifier.fillMaxSize()) {
                // Contenido principal centrado
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .align(Alignment.Center),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = stringResource(R.string.Title),
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFF36C5D)
                    )

                    Text(
                        text = stringResource(R.string.Description),
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )

                    AnimatedContent(
                        targetState = currentIndex,
                        transitionSpec = {
                            slideInHorizontally { fullWidth -> fullWidth } + fadeIn() with
                                    slideOutHorizontally { fullWidth -> -fullWidth } + fadeOut()
                        },
                        label = "Plan Transition"
                    ) { index ->
                        val plan = plans[index]

                        Card(
                            modifier = Modifier
                                .width(320.dp)
                                .fillMaxHeight(0.7f)
                                .padding(vertical = 8.dp),
                            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
                            shape = RoundedCornerShape(16.dp)
                        ) {
                            Column(
                                modifier = Modifier.padding(16.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = plan.nombre,
                                    fontSize = 28.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFFF36C5D)
                                )

                                Spacer(modifier = Modifier.height(28.dp))

                                Row(
                                    verticalAlignment = Alignment.Bottom
                                ) {
                                    Text(stringResource(R.string.beforeLbl), fontSize = 20.sp, color = Color.Gray)
                                    Text(
                                        text = "${plan.precioAntes}",
                                        fontSize = 24.sp,
                                        style = TextStyle(
                                            textDecoration = TextDecoration.LineThrough,
                                            color = Color.Gray
                                        ),
                                        fontWeight = FontWeight.Bold
                                    )
                                    Text(stringResource(R.string.monthLbl), fontSize = 20.sp, color = Color.Gray)
                                }

                                Row(
                                    verticalAlignment = Alignment.Bottom
                                ) {
                                    Text(stringResource(R.string.nowLbl), fontSize = 20.sp, color = Color.Gray)
                                    Text(
                                        text = "${plan.precioAhora}",
                                        fontSize = 36.sp,
                                        color = Color.Black,
                                        fontWeight = FontWeight.ExtraBold
                                    )
                                    Text(stringResource(R.string.monthLbl), fontSize = 20.sp, color = Color.Gray)
                                }

                                Text(
                                    text = plan.gigas,
                                    fontSize = 28.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Gray
                                )

                                Spacer(modifier = Modifier.height(16.dp))

                                Column(
                                    modifier = Modifier.fillMaxWidth(),
                                    horizontalAlignment = Alignment.Start
                                ) {
                                    plan.detalles.forEach {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier.padding(vertical = 8.dp)
                                        ) {
                                            Icon(
                                                imageVector = Icons.Default.Check,
                                                contentDescription = null,
                                                tint = Color.Black
                                            )
                                            Spacer(modifier = Modifier.width(8.dp))
                                            Text(text = it, fontSize = 16.sp)
                                        }
                                    }
                                }

                                Spacer(modifier = Modifier.height(16.dp))

                                Button(
                                    modifier = Modifier.fillMaxWidth(),
                                    onClick = onSuccess,
                                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF36C5D)),
                                    shape = RoundedCornerShape(50)
                                ) {
                                    Text(text = stringResource(R.string.planBtn), color = Color.White)
                                }
                            }
                        }
                    }
                }

                IconButton(
                    onClick = {
                        currentIndex = if (currentIndex == 0) plans.lastIndex else currentIndex - 1
                    },
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(start = 8.dp)
                        .background(Color(0xFFF36C5D), shape = CircleShape)
                ) {
                    Icon(Icons.Default.KeyboardArrowLeft, contentDescription = "Anterior", tint = Color.White)
                }

                IconButton(
                    onClick = {
                        currentIndex = if (currentIndex == plans.lastIndex) 0 else currentIndex + 1
                    },
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .padding(end = 8.dp)
                        .background(Color(0xFFF36C5D), shape = CircleShape)
                ) {
                    Icon(Icons.Default.KeyboardArrowRight, contentDescription = "Siguiente", tint = Color.White)
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .width(350.dp)
                        .align(Alignment.BottomStart)
                        .padding(bottom = 72.dp)
                ) {
                    listOf(
                        SocialPack.Whatsapp,
                        SocialPack.Facebook,
                        SocialPack.Instagram,
                        SocialPack.Messenger,
                        SocialPack.Twitterx,
                        SocialPack.Snapchat,
                        SocialPack.Telegram
                    ).forEach { icon ->
                        Box(
                            modifier = Modifier
                                .size(40.dp)
                                .background(Color.Black, shape = CircleShape)
                                .clickable {
                                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://cba.ucb.edu.bo/contacto/"))
                                    context.startActivity(intent)
                                },
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = icon,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(26.dp)
                            )
                        }
                    }
                }
                FloatingActionButton(
                    onClick = {
                        val numberWithCountryCode = number
                        try {
                            val intent = Intent(Intent.ACTION_VIEW).apply {
                                setPackage("com.whatsapp")
                                data = Uri.parse("https://api.whatsapp.com/send?phone=$numberWithCountryCode&text=${Uri.encode(message)}")
                            }
                            context.startActivity(intent)
                        } catch (e: Exception) {
                            Toast.makeText(context, error, Toast.LENGTH_SHORT).show()
                        }
                    },
                    containerColor = Color(0xFF25D366),
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .padding(
                            WindowInsets.navigationBars
                                .asPaddingValues()
                        )
                        .padding(bottom = 45.dp, end = 16.dp),
                    shape = CircleShape
                ) {
                    Icon(
                        imageVector = SocialPack.Whatsapp2,
                        contentDescription = "WhatsApp",
                        tint = Color.White,
                        modifier = Modifier.size(45.dp)
                    )
                }
            }
        }

        is PlanViewModel.PlanState.Error -> {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Text(ui.message)
            }
        }
    }
}
