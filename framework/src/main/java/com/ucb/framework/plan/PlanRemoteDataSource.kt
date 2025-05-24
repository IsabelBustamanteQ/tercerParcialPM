package com.ucb.framework.plan

import com.ucb.data.NetworkResult
import com.ucb.data.plan.IPlanRemoteDataSource
import com.ucb.domain.plan.Plan
import com.ucb.framework.service.RetrofitBuilder
import org.json.JSONArray

class PlanRemoteDataSource(retrofiService: RetrofitBuilder
): IPlanRemoteDataSource {
    override suspend fun fetchPlans(): NetworkResult<List<Plan>> {
        val jsonString = """
        [
            {
                "nombre": "Plan FLEX 5",
                "precioAntes": "$270",
                "precioAhora": "$199",
                "gigas": "5GB",
                "detalles": [
                    "Llamadas y SMS ilimitados",
                    "Hotspot. Comparte tus datos",
                    "Redes Sociales ilimitadas incluidas",
                    "Arma tu plan con más apps ilimitadas",
                    "CO2 Negativo"
                ]
            },
            {
                "nombre": "Plan FLEX 8",
                "precioAntes": "$370",
                "precioAhora": "$299",
                "gigas": "8GB",
                "detalles": [
                    "Llamadas y SMS ilimitados",
                    "Hotspot. Comparte tus datos",
                    "Redes Sociales ilimitadas incluidas",
                    "Arma tu plan con más apps ilimitadas",
                    "CO2 Negativo"
                ]
            },
            {
                "nombre": "Plan FLEX 10",
                "precioAntes": "${'$'}470",
                "precioAhora": "${'$'}399",
                "gigas": "10GB",
                "detalles": [
                    "Llamadas y SMS ilimitados",
                    "Hotspot. Comparte tus datos",
                    "Redes Sociales ilimitadas incluidas",
                    "Arma tu plan con más apps ilimitadas",
                    "CO2 Negativo"
                ]
            }
        ]
    """.trimIndent()

        val jsonArray = JSONArray(jsonString)
        val plans = mutableListOf<Plan>()

        for (i in 0 until jsonArray.length()) {
            val obj = jsonArray.getJSONObject(i)
            val detallesJsonArray = obj.getJSONArray("detalles")
            val detallesList = mutableListOf<String>()
            for (j in 0 until detallesJsonArray.length()) {
                detallesList.add(detallesJsonArray.getString(j))
            }

            val plan = Plan(
                nombre = obj.getString("nombre"),
                precioAntes = obj.getString("precioAntes"),
                precioAhora = obj.getString("precioAhora"),
                gigas = obj.getString("gigas"),
                detalles = detallesList
            )
            plans.add(plan)
        }

        return NetworkResult.Success(plans)
    }

    override suspend fun fetchNumber(): NetworkResult<String> {
        return NetworkResult.Success("59177997907")
    }
}