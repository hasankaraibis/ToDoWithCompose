package com.hasankaraibis.todowithcompose.navigation

import androidx.navigation.NavHostController
import com.hasankaraibis.todowithcompose.util.Action
import com.hasankaraibis.todowithcompose.util.Constants.LIST_SCREEN

class Screens(navController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }
    val task: (Int) -> Unit = { taskId ->
        navController.navigate("list/${taskId}")
    }
}