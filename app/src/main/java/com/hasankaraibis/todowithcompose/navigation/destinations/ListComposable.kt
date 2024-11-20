package com.hasankaraibis.todowithcompose.navigation.destinations

import android.util.Log
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.hasankaraibis.todowithcompose.ui.screens.list.ListScreen
import com.hasankaraibis.todowithcompose.ui.viewmodels.SharedViewModel
import com.hasankaraibis.todowithcompose.util.Constants.LIST_ARGUMENT_KEY
import com.hasankaraibis.todowithcompose.util.Constants.LIST_SCREEN
import com.hasankaraibis.todowithcompose.util.toAction

fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (taskId: Int) -> Unit,
    sharedViewModel: SharedViewModel
) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY) {
            type = NavType.StringType
        })
    ) { navBaclStackEntry ->
        val action = navBaclStackEntry.arguments?.getString(LIST_ARGUMENT_KEY).toAction()
        Log.d("ListComposable", action.name)

        LaunchedEffect(key1 = action) {
            sharedViewModel.action.value = action
        }

        ListScreen(
            navigateToTaskScreen = navigateToTaskScreen,
            sharedViewModel = sharedViewModel
        )
    }
}