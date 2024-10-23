package com.example.navigationcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationcompose.ui.theme.NavigationComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()


            NavigationComposeTheme {
                NavHost(
                    navController = navController,
                    startDestination = "screen_1"
                ) {
                    composable("screen_1") {
                        Screen_1 {
                            navController.navigate("screen_2")
                        }
                    }
                    composable("screen_2") {
                        Screen_2 {
                            navController.navigate("screen_3")
                        }
                    }
                    composable("screen_3") {
                        Screen_3 {
                            navController.navigate("screen_1"){
                                popUpTo("screen_1"){
                                    inclusive = true
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

