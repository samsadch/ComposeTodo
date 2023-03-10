package com.samsad.composetodo.ui.screens.list

import android.util.Log
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.stringResource
import com.samsad.composetodo.R
import com.samsad.composetodo.ui.theme.FabBgColor
import com.samsad.composetodo.ui.viewmodels.SharedViewModel
import com.samsad.composetodo.util.SearchAppBarState

/**
 * @Author: Samsad Chalil Valappil
 * @Date: 19/01/2023
 */

@Composable
fun ListScreen(
    navigateToTaskScreen: (taskId: Int) -> Unit,
    sharedViewModel: SharedViewModel
) {
    LaunchedEffect(key1 = true) {
        sharedViewModel.getAllTasks()
    }
    val action by sharedViewModel.action
    val allTasks by sharedViewModel.allTasks.collectAsState()

    val searchAppBarState: SearchAppBarState by sharedViewModel.searchAppBarState
    val searchTextState: String by sharedViewModel.searchTextState

    sharedViewModel.handleDatabaseActions(action = action)

    Scaffold(
        topBar = {
            ListAppBar(sharedViewModel = sharedViewModel, searchAppBarState, searchTextState)
        },
        content = {
            ListContent(allTasks, navigateToTaskScreen)
        },
        floatingActionButton = {
            ListFab(navigateToTaskScreen)
        }
    )
}

@Composable
fun ListFab(
    onFabClicked: (taskId: Int) -> Unit
) {
    FloatingActionButton(
        onClick = {
            onFabClicked(-1)
        },
        backgroundColor = MaterialTheme.colors.FabBgColor
    ) {
        Icon(
            imageVector = Icons.Filled.Add,
            contentDescription = stringResource(R.string.cd_add_button)
        )
    }
}

/*
@Composable
@Preview
private fun ListScreenPreview() {
    ListScreen({})
}*/
