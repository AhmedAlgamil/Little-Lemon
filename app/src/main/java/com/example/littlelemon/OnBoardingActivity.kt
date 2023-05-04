package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.ui.theme.LittleLemonTheme

class OnBoardingActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting2("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String) {
    Column() {
        Text(
            text = "Hello $name!",
            color = Color.Blue,
            fontSize = 20.sp,
        )
        Button(onClick = { /*TODO*/ }) {
            Text(
                text = "Hello $name!",
                color = Color.Blue,
                fontSize = 20.sp,
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    LittleLemonTheme {
        Greeting2("Android")
    }
}