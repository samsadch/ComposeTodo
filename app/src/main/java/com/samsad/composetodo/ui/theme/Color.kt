package com.samsad.composetodo.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val LightGrey = Color(0xFFFCFCFC)
val MediumGrey = Color(0xFF9c9c9c)
val DarkGrey = Color(0xFF141414)

val LowPriorityColor = Color(0xFF00C980)
val MediumPriorityColor = Color(0xFFFFC114)
val HighPriorityColor = Color(0xFFFF4646)
val NonePriorityColor = Color(0xFFFFFFFF)

val Colors.topAppBarContentColor: Color
    @Composable
    get() = if (isLight) Color.White else LightGrey


val Colors.topAppBarBgColor: Color
    @Composable
    get() = if (isLight) Purple500 else Color.Black