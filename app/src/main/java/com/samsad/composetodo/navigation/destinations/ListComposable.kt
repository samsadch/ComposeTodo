package com.samsad.composetodo.navigation.destinations

import android.util.Log
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.samsad.composetodo.ui.screens.list.ListScreen
import com.samsad.composetodo.ui.viewmodels.SharedViewModel
import com.samsad.composetodo.util.Constants.LIST_ARGUMENT_KEY
import com.samsad.composetodo.util.Constants.LIST_SCREEN
import com.samsad.composetodo.util.toAction

/**
 * @Author: Samsad Chalil Valappil
 * @Date: 16/01/2023
 */
fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (taskId: Int) -> Unit,
    sharedViewModel: SharedViewModel
) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY) {
            type = NavType.StringType
        })
    ) { navBackStackEntry ->
        val action = navBackStackEntry.arguments?.getString(LIST_ARGUMENT_KEY).toAction()
        Log.d("ListComposable", action.name)
        LaunchedEffect(key1 = action) {
            sharedViewModel.action.value = action
        }
        ListScreen(navigateToTaskScreen = navigateToTaskScreen, sharedViewModel = sharedViewModel)
    }
}