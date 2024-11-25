package com.hasankaraibis.todowithcompose.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.hasankaraibis.todowithcompose.ui.screens.splash.SplashScreen
import com.hasankaraibis.todowithcompose.util.Constants.SPLASH_SCREEN

fun NavGraphBuilder.splashComposable(
    navigateToListScreen: () -> Unit,
) {
    composable(
        route = SPLASH_SCREEN
    ) {
        SplashScreen(navigateToListScreen = navigateToListScreen)
    }
}