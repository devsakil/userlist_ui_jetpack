package com.example.userlist_ui_jetpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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