package com.hasankaraibis.todowithcompose.ui.screens.list

import android.widget.ListAdapter
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.hasankaraibis.todowithcompose.ui.theme.topAppBarBackGroundColor
import com.hasankaraibis.todowithcompose.ui.theme.topAppBarContentColor

@Composable
fun ListAppBar() {
    DefaultListAppBar()
}

@Composable
fun DefaultListAppBar() {
    TopAppBar(
        title = {
            Text(
                text = "Tasks",
                color = MaterialTheme.colors.topAppBarContentColor
            )
        },
        backgroundColor = MaterialTheme.colors.topAppBarBackGroundColor
    )
}


@Composable
@Preview
fun DefaultListAppBarPreview() {
    DefaultListAppBar()
}