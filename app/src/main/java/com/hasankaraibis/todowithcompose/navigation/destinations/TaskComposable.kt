package com.hasankaraibis.todowithcompose.navigation.destinations

import android.util.Log
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.hasankaraibis.todowithcompose.ui.screens.task.TaskScreen
import com.hasankaraibis.todowithcompose.ui.viewmodels.SharedViewModel
import com.hasankaraibis.todowithcompose.util.Action
import com.hasankaraibis.todowithcompose.util.Constants
import com.hasankaraibis.todowithcompose.util.Constants.TASK_ARGUMENT_KEY
import com.hasankaraibis.todowithcompose.util.Constants.TASK_SCREEN

fun NavGraphBuilder.taskComposable(
    sharedViewModel: SharedViewModel,
    navigateToListScreen: (Action) -> Unit
) {
    composable(
        route = TASK_SCREEN,
        arguments = listOf(navArgument(TASK_ARGUMENT_KEY) {
            type = NavType.IntType
        })
    ) { navBackStachEntry ->
        val taskId = navBackStachEntry.arguments!!.getInt(TASK_ARGUMENT_KEY)
        sharedViewModel.getSelectedTask(taskId = taskId)
        val selectedTask by sharedViewModel.selectedTask.collectAsState()

        TaskScreen(
            selectedTask = selectedTask,
            navigateToListScreen = navigateToListScreen
        )
    }
}