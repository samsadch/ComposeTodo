package com.samsad.composetodo.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.samsad.composetodo.util.Constants.LIST_ARGUMENT_KEY
import com.samsad.composetodo.util.Constants.LIST_SCREEN

/**
 * @Author: Samsad Chalil Valappil
 * @Date: 16/01/2023
 */
fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (Int) -> Unit
) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY) {
            type = NavType.StringType
        })
    ) {

    }
}