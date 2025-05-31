package com.kuit.kuit5.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.kuit.kuit5.ui.asset.screen.AssetsScreen
import com.kuit.kuit5.ui.health.screen.HealthScreen
import com.kuit.kuit5.ui.home.screen.HomeScreen
import com.kuit.kuit5.ui.record.screen.RecordsScreen
import com.kuit.kuit5.ui.shopping.screen.CreateAccountResultScreen
import com.kuit.kuit5.ui.shopping.screen.CreateAccountScreen
import com.kuit.kuit5.ui.shopping.screen.ProductInfoScreen
import com.kuit.kuit5.ui.shopping.screen.ShoppingScreen
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel
import com.kuit.kuit5.util.sharedViewModel

@Composable
fun KuitNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Route.Home.route,
    ){
        // 홈
        composable(route = Route.Home.route) {
            HomeScreen()
        }
        // 자산
        composable(route = Route.Assets.route) {
            AssetsScreen()
        }
        // 가계부
        composable(route = Route.Records.route) {
            RecordsScreen()
        }
        // 건강
        composable(route = Route.Health.route) {
            HealthScreen()
        }

        navigation(route = Route.ShoppingSubGraph.route, startDestination = Route.Shopping.route) {
            // 금융쇼핑
            composable(route = Route.Shopping.route) { navBackStackEntry ->
                val viewModel = navBackStackEntry.sharedViewModel<ShoppingViewModel>(navController)
                ShoppingScreen(
                    viewModel = viewModel,
                    onNavigateToProductInfo= {
                        navController.navigate(Route.ProductInfo.route)
                    }
                )
            }

            composable(route = Route.ProductInfo.route) {
                val viewModel = it.sharedViewModel<ShoppingViewModel>(navController)
                ProductInfoScreen(
                    viewModel = viewModel,
                    onNavigateToCreateAccount= {
                        navController.navigate(Route.CreateAccount.route)
                    }
                )
            }

            composable(route = Route.CreateAccount.route) {
                val viewModel = it.sharedViewModel<ShoppingViewModel>(navController)
                CreateAccountScreen(
                    viewModel = viewModel,
                    onNavigateToCreateAccountResult= {
                        navController.navigate(Route.CreateAccountResult.route)
                    }
                )
            }

            composable(route = Route.CreateAccountResult.route) {
                val viewModel = it.sharedViewModel<ShoppingViewModel>(navController)
                CreateAccountResultScreen(
                    viewModel = viewModel,
                    onNavigateToShopping= {
                        navController.navigate(Route.Shopping.route)
                    }
                )
            }
        }

    }
}
