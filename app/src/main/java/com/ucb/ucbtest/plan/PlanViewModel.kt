package com.ucb.ucbtest.plan

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ucb.data.NetworkResult
import com.ucb.domain.plan.Plan
import com.ucb.ucbtest.R
import com.ucb.ucbtest.service.InternetConnection
import com.ucb.usecases.plan.GetNumber
import com.ucb.usecases.plan.GetPlans
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class PlanViewModel @Inject constructor(
    private val getPlans: GetPlans,private val getNumber: GetNumber,
    @ApplicationContext private val context: Context
): ViewModel() {

    sealed class PlanState {
        object Init: PlanState()
        data class Successful(val list: List<Plan>): PlanState()
        data class Error(val message: String): PlanState()
    }
    private val _flow = MutableStateFlow<PlanState>(PlanState.Init)
    val flow : StateFlow<PlanState> = _flow

    fun fetchPlans() {
        viewModelScope.launch {
            val result = withContext(Dispatchers.IO) { getPlans.invoke() }
            when (result) {
                is NetworkResult.Success -> {
                    _flow.value = PlanState.Successful(list = result.data)
                }
                is NetworkResult.Error -> {
                    _flow.value = PlanState.Error(result.error)
                }
            }
        }
    }
    private val _phoneNumber = MutableStateFlow<String?>(null)
    val phoneNumber: StateFlow<String?> = _phoneNumber

    fun getNumber() {
        viewModelScope.launch {
            val result = withContext(Dispatchers.IO) { getNumber.invoke() }
            when (result) {
                is NetworkResult.Success -> {
                    _phoneNumber.value = result.data
                }
                is NetworkResult.Error -> {
                    _flow.value = PlanState.Error(result.error)
                }
            }
        }
    }


}