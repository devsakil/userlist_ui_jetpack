package com.example.userlist_ui_jetpack

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.sp

@Composable
fun Title(name: String) {
    val context = LocalContext.current
    Text(
        text = "Hello $name!",
        fontSize = 20.sp,
        color = colorResource(id = R.color.black),
        modifier = Modifier.clickable {
            Toast.makeText(context,"Title Clicked" , Toast.LENGTH_SHORT).show()
        }

    )

}

@Composable
fun HomePage(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(),
    ) {
        MainContent()
    }
}