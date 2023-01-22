package com.samsad.composetodo.navigation

import androidx.navigation.NavHostController
import com.samsad.composetodo.util.Action
import com.samsad.composetodo.util.Constants.LIST_SCREEN

/**
 * @Author: Samsad Chalil Valappil
 * @Date: 12/01/2023
 */
class Screens(navController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }
    val task: (Int) -> Unit = { taskId ->
        navController.navigate("task/${taskId}")
    }
}