package com.ucb.usecases.plan

import com.ucb.data.NetworkResult
import com.ucb.data.PlanRepository

class GetNumber(val repository: PlanRepository) {
    suspend fun invoke(): NetworkResult<String>{
        return repository.getNumber()
    }
}