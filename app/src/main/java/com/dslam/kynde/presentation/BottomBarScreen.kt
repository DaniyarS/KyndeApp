package com.dslam.kynde.presentation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val icon: ImageVector,
    val title: String
) {

    data object HomeScreen : BottomBarScreen(
        route = "home",
        icon = Icons.Filled.Home,
        title = "Home"
    )

    data object TasksScreen : BottomBarScreen(
        route = "my_tasks",
        icon = Icons.Filled.List,
        title = "My tasks"
    )

    data object ProgressScreen : BottomBarScreen(
        route = "progress",
        icon = Icons.Filled.Check,
        title = "My progress"
    )

    data object AccountScreen : BottomBarScreen(
        route = "account",
        icon = Icons.Filled.Person,
        title = "Profile"
    )
}
