package com.ucb.data
import com.ucb.data.plan.IPlanRemoteDataSource
import com.ucb.domain.plan.Plan

class PlanRepository(val remoteDataSource: IPlanRemoteDataSource,
) {
    suspend fun getPlans(): NetworkResult<List<Plan>> {
        return this.remoteDataSource.fetchPlans()
    }
    suspend fun getNumber(): NetworkResult<String> {
        return this.remoteDataSource.fetchNumber()
    }
}