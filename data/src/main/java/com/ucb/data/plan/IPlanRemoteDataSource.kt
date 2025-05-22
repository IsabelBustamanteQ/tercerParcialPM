package com.ucb.data.plan
import com.ucb.data.NetworkResult
import com.ucb.domain.plan.Plan

interface IPlanRemoteDataSource {
    suspend fun fetchPlans(): NetworkResult<List<Plan>>
}