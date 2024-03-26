package com.hasankaraibis.todowithcompose.ui.screens.task

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.hasankaraibis.todowithcompose.util.Action

@Composable
fun TaskScreen (
    navigateToListScreen: (Action) -> Unit
) {
    Scaffold(
        topBar = {
                 TaskAppBar(navigateToListScreen = navigateToListScreen)
        },
        content = {}
    )
}