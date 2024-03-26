package com.hasankaraibis.todowithcompose.ui.screens.task

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.hasankaraibis.todowithcompose.data.models.ToDoTask
import com.hasankaraibis.todowithcompose.util.Action

@Composable
fun TaskScreen (
    selectedTask: ToDoTask?,
    navigateToListScreen: (Action) -> Unit
) {
    Scaffold(
        topBar = {
                 TaskAppBar(
                     selectedTask = selectedTask,
                     navigateToListScreen = navigateToListScreen
                 )
        },
        content = {}
    )
}