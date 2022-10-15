package com.example.userlist_ui_jetpack
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.userlist_ui_jetpack.profile.ProfilePage

@Composable
fun NavContent(){
    val    navController = rememberNavController()
   Surface(
       modifier = Modifier.fillMaxSize()
   ) {
        NavHost(
            navController = navController,
            startDestination = "home",
        ){
            composable("home"){
                HomePage(navController)
            }
            composable("profile"){
                ProfilePage(navController)
            }
        }
    }
}

