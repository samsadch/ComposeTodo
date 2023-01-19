package com.samsad.composetodo.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samsad.composetodo.data.models.Priority
import com.samsad.composetodo.ui.theme.MEDIUM_PADDING
import com.samsad.composetodo.ui.theme.PRIORITY_INDICATOR_SIZE
import com.samsad.composetodo.ui.theme.Typography

/**
 * @Author: Samsad Chalil Valappil
 * @Date: 19/01/2023
 */
@Composable
fun PriorityItem(priority: Priority) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Canvas(modifier = Modifier.size(PRIORITY_INDICATOR_SIZE)) {
            drawCircle(color = priority.color)
        }
        Text(
            modifier = Modifier.padding(start = MEDIUM_PADDING),
            text = priority.name,
            style = Typography.subtitle1,
            color = MaterialTheme.colors.onSurface
        )
    }
}

@Composable
@Preview
fun PriorityItemPreview() {
    PriorityItem(Priority.LOW)
}