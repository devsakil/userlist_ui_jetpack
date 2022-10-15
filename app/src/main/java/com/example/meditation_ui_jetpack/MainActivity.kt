package com.example.meditation_ui_jetpack

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.meditation_ui_jetpack.ui.theme.Meditation_ui_jetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Meditation_ui_jetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}


@Composable
fun UserCard(){
    Row() {

        Image(
            painter = painterResource(id = R.drawable.sakil),
            contentDescription = null,
            modifier = Modifier
                .size(128.dp)
                .clip(CircleShape)
        )
    }
}

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
    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        UserCard()
        Title("Sakil")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Meditation_ui_jetpackTheme {
        Surface(modifier = Modifier.fillMaxSize()){
            HomePage()
        }
    }
}