package com.samsad.composetodo.ui.screens.task

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.samsad.composetodo.data.models.Priority
import com.samsad.composetodo.data.models.TodoTask
import com.samsad.composetodo.util.Action

/**
 * @Author: Samsad Chalil Valappil
 * @Date: 22/01/2023
 */

@Composable
fun TaskScreen(
    selectedTask: TodoTask?,
    navigateToListScreen: (Action) -> Unit
) {
    Scaffold(
        topBar = {
            TaskAppBar(
                selectedTask = selectedTask,
                navigateToListScreen = navigateToListScreen
            )
        },
        content = {
            if (selectedTask != null) {
                TaskContent(
                    title = selectedTask.title,
                    onTitleChange = {},
                    description = selectedTask.description,
                    onDescriptionChange = {},
                    priority = selectedTask.priority,
                    onPrioritySelected = {}
                )
            } else {
                TaskContent(
                    title = "",
                    onTitleChange = {},
                    description = "",
                    onDescriptionChange = {},
                    priority = Priority.LOW,
                    onPrioritySelected = {}
                )
            }

        }
    )
}