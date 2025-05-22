package com.ucb.usecases.plan

import com.ucb.data.NetworkResult
import com.ucb.data.PlanRepository
import com.ucb.domain.plan.Plan

class GetPlans(val repository: PlanRepository) {
    suspend fun invoke(): NetworkResult<List<Plan>> {
        return repository.getPlans()
    }
}
