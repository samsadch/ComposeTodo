package com.samsad.composetodo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.samsad.composetodo.navigation.SetupNavigation
import com.samsad.composetodo.ui.theme.ComposeTodoTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTodoTheme {
                navController = rememberNavController()
                SetupNavigation(navController = navController)
            }
        }
    }
}
