package com.example.userlist_ui_jetpack.profile

import androidx.compose.foundation.layout.Box
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun ProfilePage(navController:NavHostController?=null) {
   Surface() {
       Box() {
           Text(text = "Profile Page")
       }
   }
}
