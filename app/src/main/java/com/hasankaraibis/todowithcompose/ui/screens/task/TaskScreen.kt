package com.hasankaraibis.todowithcompose.ui.screens.task

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.hasankaraibis.todowithcompose.data.models.Priority
import com.hasankaraibis.todowithcompose.data.models.ToDoTask
import com.hasankaraibis.todowithcompose.util.Action

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
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
        content = {
            TaskContent(
                title = "",
                onTitleChange = {},
                description = "",
                onDescriptionChange = {},
                priority = Priority.HIGH,
                onPrioritySelected = {}
            )
        }
    )
}