package me.danikvitek.lab2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable
import me.danikvitek.lab2.ui.theme.Lab2Theme

@Serializable
data object Screen1
@Serializable
data object Screen2
@Serializable
data object Screen3
@Serializable
data object Screen4

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            Lab2Theme {
                Scaffold { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = Screen1,
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable<Screen1> {
                            Screen1(
                                onNavigateToScreen2 = { navController.navigate(route = Screen2) },
                                onNavigateToScreen3 = { navController.navigate(route = Screen3) },
                                onNavigateToScreen4 = { navController.navigate(route = Screen4) },
                                onExit = { finishAndRemoveTask() },
                            )
                        }
                        composable<Screen2> { Screen2() }
                        composable<Screen3> { Screen3() }
                        composable<Screen4> { Screen4() }
                    }
                }
            }
        }
    }
}
