package com.project.trivia1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.trivia1.ui.theme.Trivia1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                MainContent("Anuj Thakur")
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    Trivia1Theme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background,
        ) {
            content()
        }
    }
}

@Composable
fun MainContent(name: String) {
    Column(
        modifier = Modifier.padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painterResource(R.drawable.jetpack_compose_logo), "Jetpack Compose Logo")
        Text(text = name, color = Color(56, 112, 179, 255),
            modifier = Modifier.padding(12.dp),
            fontSize = 20.sp)
        Text(text = "❤️")
        Text(text = "Jetpack Compose", color = Color(8, 48, 66 , 255),
            modifier = Modifier.padding(12.dp),
            fontSize = 20.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp {
        MainContent("Anuj Thakur")
    }
}