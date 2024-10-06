package com.dslam.kynde.presentation.screen

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector
import com.dslam.kynde.R

sealed class BottomBarScreen(
    val route: String,
    val icon: ImageVector,
    val titleRes: Int
) {

    data object Home : BottomBarScreen(
        route = "home",
        icon = Icons.Filled.Home,
        titleRes = R.string.home_title
    )

    data object Tasks : BottomBarScreen(
        route = "my_tasks",
        icon = Icons.AutoMirrored.Filled.List,
        titleRes = R.string.tasks_title
    )

    data object Progress : BottomBarScreen(
        route = "progress",
        icon = Icons.Filled.Check,
        titleRes = R.string.progress_title
    )

    data object Profile : BottomBarScreen(
        route = "account",
        icon = Icons.Filled.Person,
        titleRes = R.string.profile_title
    )
}