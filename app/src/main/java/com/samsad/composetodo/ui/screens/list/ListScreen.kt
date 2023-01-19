package com.samsad.composetodo.ui.screens.list

import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.samsad.composetodo.R
import com.samsad.composetodo.ui.theme.FabBgColor

/**
 * @Author: Samsad Chalil Valappil
 * @Date: 19/01/2023
 */

@Composable
fun ListScreen(
    navigateToTaskScreen: (taskId: Int) -> Unit
) {
    Scaffold(
        topBar = {
            ListAppBar()
        },
        content = {

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

@Composable
@Preview
private fun ListScreenPreview() {
    ListScreen({})
}