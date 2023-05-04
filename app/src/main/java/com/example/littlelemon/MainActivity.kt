package com.example.littlelemon

import android.R
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.ui.theme.LittleLemonTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    val isYes: Boolean = true
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(),
        content = {
            TopAppBar(
                backgroundColor = Color.White,
                elevation = 0.dp,
            ) {
                Row() {
                    Text(
                        text = "Hello $name!",
                        color = Color.Blue,
                        fontSize = 20.sp,
                    )
                }
            }
            Greeting3(name = "yess")
            Text(text = "Hello $name!",
                color = Color.Blue,
                fontSize = 20.sp,
                modifier = Modifier
                    .background(color = Color.White)
                    .border(width = 5.dp, color = Color.Black)
                    .padding(20.dp)
                    .align(Alignment.Start)
            )
            Button(
                onClick = { },
                modifier = Modifier
                    .align(Alignment.Start)
                ) {
                Text(
                    text = "Hello $name!",
                    color = Color.Blue,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .background(color = Color.White)
                        .border(width = 5.dp, color = Color.Black)

                )
            }
        }
    )
}


@Composable
fun Greeting3(name: String) {
    val isYes: Boolean = true
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        content = {
            TopAppBar(
                backgroundColor = Color.White,
                elevation = 0.dp,
            ) {
                Row() {
                    Text(
                        text = "Hello $name!",
                        color = Color.Blue,
                        fontSize = 20.sp,
                    )
                }
            }
            Text(text = "Hello $name!",
                color = Color.Blue,
                fontSize = 20.sp,
                modifier = Modifier
                    .background(color = Color.White)
                    .border(width = 5.dp, color = Color.Black)
                    .padding(20.dp)


            )
            Button(
                onClick = { },

                ) {
                Text(
                    text = "Hello $name!",
                    color = Color.Blue,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .background(color = Color.White)
                        .border(width = 5.dp, color = Color.Black)
                )
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LittleLemonTheme {
        Greeting("Android")
    }
}