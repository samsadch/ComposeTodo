package com.samsad.composetodo.ui.screens.list

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import com.samsad.composetodo.R
import com.samsad.composetodo.components.PriorityItem
import com.samsad.composetodo.data.models.Priority
import com.samsad.composetodo.ui.theme.*

/**
 * @Author: Samsad Chalil Valappil
 * @Date: 19/01/2023
 */
@Composable
fun ListAppBar() {
    DefaultListAppBar(
        onSerachClick = {

        },
        onSortClick = {

        },
        onDeleteClicked = {

        }
    )
}

@Composable
fun DefaultListAppBar(
    onSerachClick: () -> Unit,
    onSortClick: (Priority) -> Unit,
    onDeleteClicked: () -> Unit
) {
    TopAppBar(
        title = {
            Text(
                text = "Tasks",
                color = MaterialTheme.colors.topAppBarContentColor
            )
        },
        actions = {
            ListAppBarActions(
                onSerachClick = onSerachClick,
                onSortClick = onSortClick,
                onDeleteClicked = onDeleteClicked
            )
        },
        backgroundColor = MaterialTheme.colors.topAppBarBgColor,
    )
}

@Composable
fun ListAppBarActions(
    onSerachClick: () -> Unit,
    onSortClick: (Priority) -> Unit,
    onDeleteClicked: () -> Unit,
) {
    SerachAction(onSerachClick = onSerachClick)
    SortAction(onSortClick = onSortClick)
    DeleteAll(onDeleteClicked = onDeleteClicked)
}

@Composable
fun SerachAction(
    onSerachClick: () -> Unit
) {
    IconButton(onClick = { onSerachClick() }) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = stringResource(R.string.cd_serach_tasks),
            tint = MaterialTheme.colors.topAppBarContentColor
        )
    }
}

@Composable
fun SortAction(
    onSortClick: (Priority) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }
    IconButton(onClick = {
        expanded = true
    }) {
        Icon(
            painter = painterResource(id = R.drawable.ic_filter_list),
            contentDescription = stringResource(R.string.cd_sort_tasks),
            tint = MaterialTheme.colors.topAppBarContentColor
        )
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false })
        {
            DropdownMenuItem(onClick = { expanded = false }) {
                PriorityItem(priority = Priority.LOW)
                onSortClick(Priority.LOW)
            }
            DropdownMenuItem(onClick = { expanded = false }) {
                PriorityItem(priority = Priority.HIGH)
                onSortClick(Priority.HIGH)
            }
            DropdownMenuItem(onClick = { expanded = false }) {
                PriorityItem(priority = Priority.NONE)
                onSortClick(Priority.NONE)
            }
        }
    }
}

@Composable
fun DeleteAll(
    onDeleteClicked: () -> Unit
) {
    var expanded by remember { mutableStateOf(false) }
    IconButton(onClick = {
        expanded = true
    }) {
        Icon(
            painter = painterResource(id = R.drawable.ic_vertical_more),
            contentDescription = stringResource(R.string.delete_all_action),
            tint = MaterialTheme.colors.topAppBarContentColor
        )
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false })
        {
            DropdownMenuItem(onClick = {
                expanded = false
                onDeleteClicked()
            }) {
                Text(
                    modifier = Modifier.padding(LARGE_PADDING),
                    text = stringResource(R.string.delete_all_action),
                    style = Typography.subtitle2
                )
            }
        }
    }
}

@Composable
fun SerachAppBar(
    text: String,
    onTextChange: (String) -> Unit,
    onCloseClicked: () -> Unit,
    onSerachClicked: (String) -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(TOP_APP_BAR_HEIGHT),
        elevation = AppBarDefaults.TopAppBarElevation,
        color = MaterialTheme.colors.topAppBarBgColor
    ) {
        TextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = text,
            onValueChange = {
                onTextChange(it)
            },
            placeholder = {
                Text(
                    modifier = Modifier.alpha(ContentAlpha.medium),
                    text = stringResource(R.string.search),
                    color = Color.White
                )
            },
            textStyle = TextStyle(
                color = MaterialTheme.colors.topAppBarContentColor,
                fontSize = MaterialTheme.typography.subtitle1.fontSize
            ),
            singleLine = true,
            leadingIcon = {
                IconButton(
                    modifier = Modifier.alpha(ContentAlpha.disabled),
                    onClick = {}
                ) {
                    Icon(
                        imageVector = Icons.Filled.Search,
                        contentDescription = stringResource(id = R.string.search_icon),
                        tint = MaterialTheme.colors.topAppBarContentColor
                    )
                }
            },
            trailingIcon = {
                IconButton(
                    onClick = {
                        onCloseClicked()
                    }
                ) {
                    Icon(
                        imageVector = Icons.Filled.Close,
                        contentDescription = stringResource(id = R.string.close_icon),
                        tint = MaterialTheme.colors.topAppBarContentColor
                    )
                }
            },
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Search
            ),
            keyboardActions = KeyboardActions(
                onSearch = {
                    onSerachClicked(text)
                }
            ),
            colors = TextFieldDefaults.textFieldColors(
                cursorColor = MaterialTheme.colors.topAppBarContentColor,
                focusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                backgroundColor = Color.Transparent
            )
        )
    }
}


@Composable
@Preview
fun DefaultListAppBarPreview() {
    DefaultListAppBar(
        onSerachClick = {},
        onSortClick = {},
        onDeleteClicked = {}
    )
}

@Composable
@Preview
fun SerachAppBarPreview() {
    SerachAppBar(
        text = "Serach",
        onTextChange = {},
        onCloseClicked = {},
        onSerachClicked = {}
    )
}