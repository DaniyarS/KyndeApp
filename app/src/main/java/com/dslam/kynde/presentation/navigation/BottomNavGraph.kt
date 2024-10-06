package com.dslam.kynde.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.dslam.kynde.presentation.feature.profile.AccountScreen
import com.dslam.kynde.presentation.feature.home.HomeScreen
import com.dslam.kynde.presentation.feature.progress.ProgressScreen
import com.dslam.kynde.presentation.feature.tasks.TasksScreen
import com.dslam.kynde.presentation.screen.BottomBarScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(BottomBarScreen.Home.route) { HomeScreen() }
        composable(BottomBarScreen.Tasks.route) { TasksScreen() }
        composable(BottomBarScreen.Progress.route) { ProgressScreen() }
        composable(BottomBarScreen.Profile.route) { AccountScreen() }
    }
}