package com.samsad.composetodo.ui.screens.task

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.samsad.composetodo.util.Action

/**
 * @Author: Samsad Chalil Valappil
 * @Date: 22/01/2023
 */

@Composable
fun TaskScreen(
    navigateToListScreen: (Action) -> Unit
) {
    Scaffold(
        topBar = {
            TaskAppBar(navigateToListScreen = navigateToListScreen)
        },
        content = {}
    )
}