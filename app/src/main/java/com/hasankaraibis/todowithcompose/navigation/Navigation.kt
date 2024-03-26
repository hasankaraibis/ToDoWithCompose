package com.hasankaraibis.todowithcompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.hasankaraibis.todowithcompose.navigation.destinations.listComposable
import com.hasankaraibis.todowithcompose.navigation.destinations.taskComposable
import com.hasankaraibis.todowithcompose.ui.viewmodels.SharedViewModel
import com.hasankaraibis.todowithcompose.util.Constants.LIST_SCREEN

@Composable
fun SetupNavigation(
    navController: NavHostController,
     sharedViewModel: SharedViewModel
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(
        navController = navController,
        startDestination = LIST_SCREEN
    ) {
        listComposable(
            navigateToTaskScreen = screen.task,
            sharedViewModel
        )
        taskComposable(
            sharedViewModel = sharedViewModel,
            navigateToListScreen = screen.list
        )
    }
}