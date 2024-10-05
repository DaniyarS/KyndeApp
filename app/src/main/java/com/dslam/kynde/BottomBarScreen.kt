package com.dslam.kynde

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
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

    data object NotificationScreen : BottomBarScreen(
        route = "notification",
        icon = Icons.Filled.Notifications,
        title = "Notifications"
    )

    data object ProfileScreen : BottomBarScreen(
        route = "profile",
        icon = Icons.Filled.Person,
        title = "Profile"
    )
}