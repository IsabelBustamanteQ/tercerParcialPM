package com.ucb.domain.plan

data class Plan(
    val nombre: String,
    val precioAntes:String,
    val precioAhora:String,
    val gigas:String,
    val detalles:List<String>
)