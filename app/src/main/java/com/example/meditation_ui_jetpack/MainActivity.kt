package com.example.meditation_ui_jetpack

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.meditation_ui_jetpack.ui.theme.Meditation_ui_jetpackTheme
import kotlin.math.round

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Meditation_ui_jetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    HomePage()
                }
            }
        }
    }
}


data class User(
    val id: Int,
    val name: String,
)

val users = listOf(
    User(2, "Mary"),
    User(3, "Sakil"),
    User(1, "John"),
    User(4, "Saif"),
    User(5, "Sufi"),
    User(6, "Ryhan"),
    User(7, "Shimul"),
    User(8, "Naim"),
    User(9, "Rocky"),

)
@Composable
fun UserList(){
//    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
//        for(i in 1..10){
//            UserCard()
//        }
//
//    }
    LazyColumn(){
        items(users){
         user->
            UserCard(name = user.name)
        }
    }
}

@Composable
fun UserCard(name: String){
    Card(
        shape = RoundedCornerShape(8.dp),
        elevation = 4.dp,
        modifier = Modifier
            .padding(12.dp)
            .fillMaxWidth()
            .wrapContentHeight()

    ) {


    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(12.dp)
    ) {

        Image(
            painter = painterResource(id = R.drawable.sakil),
            contentDescription = null,
            modifier = Modifier
                .size(90.dp)
                .clip(CircleShape)
        )

        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier
            .absolutePadding(left = 15.dp)

        ) {
            Text(text = name, fontWeight = FontWeight.Bold, fontSize = 17.sp)
            Text(text = stringResource(id = R.string.dummy_text))
            Button(onClick = {
                //
            },
            modifier = Modifier
                .background(color = Color.Cyan)
                ) {
                
                Text(text = "View Profile")
                
            }
        }
    }
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
        UserList()
//        Title("Sakil")
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