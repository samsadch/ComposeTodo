package com.samsad.composetodo.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.samsad.composetodo.navigation.destinations.listComposable
import com.samsad.composetodo.navigation.destinations.taskComposable
import com.samsad.composetodo.ui.viewmodels.SharedViewModel
import com.samsad.composetodo.util.Constants.LIST_SCREEN

/**
 * @Author: Samsad Chalil Valappil
 * @Date: 16/01/2023
 */

@Composable
fun SetupNavigation(
    navController: NavHostController,
    sharedViewModel: SharedViewModel
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }
    NavHost(navController = navController, startDestination = LIST_SCREEN, builder = {
        listComposable(
            navigateToTaskScreen = screen.task,
            sharedViewModel = sharedViewModel
        )
        taskComposable(
            sharedViewModel = sharedViewModel,
            navigateToListScreen = screen.list
        )
    })
}