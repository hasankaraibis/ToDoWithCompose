package com.hasankaraibis.todowithcompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.hasankaraibis.todowithcompose.navigation.destinations.listComposable
import com.hasankaraibis.todowithcompose.navigation.destinations.taskComposable
import com.hasankaraibis.todowithcompose.util.Constants.LIST_SCREEN

@Composable
fun setupNavigation(
    navController: NavHostController
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = LIST_SCREEN
    ) {
        listComposable(
            navigateToTaskScreen = screen.task
        )
        taskComposable(
            navigateToListScreen = screen.list
        )
    }
}