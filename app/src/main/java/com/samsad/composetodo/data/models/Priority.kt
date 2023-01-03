package com.samsad.composetodo.data.models

import androidx.compose.ui.graphics.Color
import com.samsad.composetodo.ui.theme.HighPriorityColor
import com.samsad.composetodo.ui.theme.LowPriorityColor
import com.samsad.composetodo.ui.theme.MediumPriorityColor
import com.samsad.composetodo.ui.theme.NonePriorityColor

/**
 * @Author: Samsad Chalil Valappil
 * @Date: 03/01/2023
 */
enum class Priority(val color: Color) {
    HIGH(HighPriorityColor), MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor), NONE(NonePriorityColor)
}