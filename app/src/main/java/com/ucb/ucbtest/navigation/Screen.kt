package com.ucb.ucbtest.navigation

sealed class Screen(val route: String) {
    //Tercer parcial
    object PlansScreen:Screen("plans")
    object SimScreen:Screen("sim")
}