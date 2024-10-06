package com.dslam.kynde.presentation.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.dslam.kynde.presentation.navigation.BottomNavGraph
import com.dslam.kynde.presentation.ui.components.BottomBar

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    val bottomBarState = rememberSaveable { mutableStateOf(BottomBarScreen.Home.route) }

    Scaffold(
        bottomBar = { BottomBar(navController = navController) }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            BottomNavGraph(navController = navController)
        }
    }
}