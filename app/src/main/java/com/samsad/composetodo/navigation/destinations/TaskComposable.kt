package com.samsad.composetodo.navigation.destinations

import android.util.Log
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.samsad.composetodo.ui.screens.task.TaskScreen
import com.samsad.composetodo.util.Action
import com.samsad.composetodo.util.Constants
import com.samsad.composetodo.util.Constants.TASK_ARGUMENT_KEY

/**
 * @Author: Samsad Chalil Valappil
 * @Date: 16/01/2023
 */
fun NavGraphBuilder.taskComposable(
    navigateToListScreen: (Action) -> Unit
) {
    composable(
        route = Constants.TASK_SCREEN,
        arguments = listOf(navArgument(TASK_ARGUMENT_KEY) {
            type = NavType.IntType
        })
    ) { navBackSTackEntry ->
        val taskId = navBackSTackEntry.arguments!!.getInt(TASK_ARGUMENT_KEY)
        Log.d("TaskComposable", taskId.toString())
        TaskScreen(navigateToListScreen = navigateToListScreen)
    }
}
