package com.example.autoexpensecompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.DirectionsCar
import androidx.compose.material.icons.filled.LocalGasStation
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.QueryStats
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.autoexpensecompose.ui.theme.OceanBlue

sealed class Screen(val route: String) {
    object AutoInfoScreen : Screen("auto")
    object EditAutoInfoScreen : Screen("edit_auto")
}

sealed class BottomBar(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Auto : BottomBar(
        route = "auto",
        title = "Авто",
        icon = Icons.Default.DirectionsCar
    )

    object Stats : BottomBar(
        route = "stats",
        title = "Статистика",
        icon = Icons.Default.QueryStats
    )

    object Service : BottomBar(
        route = "service",
        title = "Сервис",
        icon = Icons.Default.Build
    )

    object Fuel : BottomBar(
        route = "fuel",
        title = "Заправки",
        icon = Icons.Default.LocalGasStation
    )
}


@Composable
fun NavGraph(navController: NavHostController, innerPadding: PaddingValues) {
    Column(Modifier.padding(innerPadding)) {
        NavHost(
            navController = navController,
            startDestination = BottomBar.Auto.route
        ) {
            composable(route = BottomBar.Auto.route) {
                AutoInfoScreen(navController)
            }
            composable(route = BottomBar.Stats.route) {
                StatsScreen()
            }
            composable(route = BottomBar.Service.route) {
                ServiceScreen()
            }
            composable(route = BottomBar.Fuel.route) {
                FuelScreen()
            }
            composable(route = Screen.EditAutoInfoScreen.route){
                EditAutoInfoScreen(navController)
            }
        }
    }
}

@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        BottomBar.Auto,
        BottomBar.Stats,
        BottomBar.Service,
        BottomBar.Fuel
    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination?.route

    NavigationBar(
        containerColor = OceanBlue,
        tonalElevation = 5.dp
    ) {
        screens.forEach { item ->
            val selected = item.route == currentDestination
            NavigationBarItem(
                selected = selected,
                onClick = { navController.navigate(item.route) },
                icon = {
                    Column(horizontalAlignment = CenterHorizontally) {
                        Icon(imageVector = item.icon, contentDescription = item.title)
                        if (selected) {
                            Text(
                                text = item.title,
                                textAlign = TextAlign.Center,
                                fontSize = 10.sp
                            )
                        }
                    }
                }
            )
        }
    }
}