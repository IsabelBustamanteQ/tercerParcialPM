package com.ucb.ucbtest.navigation

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ucb.ucbtest.plan.PlanUI
import com.ucb.ucbtest.plan.SimUI

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.PlansScreen.route,
        enterTransition = { EnterTransition.None },
        exitTransition = { ExitTransition.None },
        popEnterTransition = { EnterTransition.None },
        popExitTransition = { ExitTransition.None }

    ) {
        //Plans
        composable(Screen.PlansScreen.route){
            PlanUI(navController=navController, onSuccess={
                navController.navigate(Screen.SimScreen.route)
            })
        }
        composable(Screen.SimScreen.route) {
            SimUI(
                onBackPressed ={ navController.popBackStack() }
            )
        }
    }


}