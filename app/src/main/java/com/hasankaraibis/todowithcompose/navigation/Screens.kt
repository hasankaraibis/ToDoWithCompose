package com.hasankaraibis.todowithcompose.navigation

import androidx.navigation.NavHostController
import com.hasankaraibis.todowithcompose.util.Action
import com.hasankaraibis.todowithcompose.util.Constants.LIST_SCREEN
import com.hasankaraibis.todowithcompose.util.Constants.SPLASH_SCREEN

class Screens(navController: NavHostController) {
    val splash:  () -> Unit = {
        navController.navigate("list/${Action.NO_ACTION.name}") {
            popUpTo(SPLASH_SCREEN) { inclusive = true }
        }
    }
    val list: (Int) -> Unit = { taskId ->
        navController.navigate("task/${taskId}")
    }

    val task: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }
}