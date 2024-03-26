package com.hasankaraibis.todowithcompose.navigation.destinations

import android.util.Log
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.hasankaraibis.todowithcompose.util.Action
import com.hasankaraibis.todowithcompose.util.Constants
import com.hasankaraibis.todowithcompose.util.Constants.TASK_ARGUMENT_KEY
import com.hasankaraibis.todowithcompose.util.Constants.TASK_SCREEN

fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (Action) -> Unit
) {
    composable(
        route = TASK_SCREEN,
        arguments = listOf(navArgument(TASK_ARGUMENT_KEY) {
            type = NavType.IntType
        })
    ) { navBackStachEntry ->
        val taskId = navBackStachEntry.arguments!!.getInt(TASK_ARGUMENT_KEY)
        Log.d("TaskComposable", taskId.toString())
    }
}