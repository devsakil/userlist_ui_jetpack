package com.example.userlist_ui_jetpack
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

data class User(
    val id: Int,
    val name: String,
)

@Composable
fun MainContent() {
    val user = User(1, "Sakil Hossain ")
    val users =  remember{ mutableStateListOf(user) }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        UserList(users = users)
        Button(
            modifier = Modifier
                .padding(24.dp)
                .align(Alignment.BottomCenter),
            onClick = {
                users.add(User(1, "Sakil Hossain"))
        }) {
            Text(text = "Add User")

        }
    }
}

@Composable
fun UserList(users:List<User>){
//    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
//        for(i in 1..10){
//            UserCard()
//        }
//    }
    LazyColumn(){
        items(users){
                user->
            UserCard(name = user.name)
        }
    }
}



//val users = listOf(
//    User(1, "John"),
//    User(2, "Mary"),
//    User(3, "Sakil"),
//    User(4, "Saif"),
//    User(5, "Sufi"),
//    User(6, "Ryhan"),
//    User(7, "Shimul"),
//    User(8, "Naim"),
//    User(9, "Rocky"),
//    )


