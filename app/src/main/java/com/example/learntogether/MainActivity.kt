package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme
import com.example.learntogether.R // Assurez-vous que cette ligne est présente

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val scrollState= rememberScrollState()
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center

    )

    {

        androidx.compose.foundation.layout.Column(
            horizontalAlignment = Alignment.CenterHorizontally, // Aligne les textes au centre horizontalement

        )

        {
            DisplayImage(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp) // Limite la hauteur de l'image
            )




        Text(
            text = "Jetpack compose tutorial",
            modifier = modifier.padding(top=6.dp),
            fontSize = 24.sp,
            fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
        )

        Text(
            text = "jetpack compose is a modern toolkit for building native android ui.compose simplifies and accelerates the development of android whith less code. powerfull tools,and intuitive kotlin APIs.",
            modifier = modifier.padding(2.dp),
            fontSize = 16.sp,
        )
            Text(
                text = "In this tutorial , you build a simple ui component with declarative functions.You call compose function to say what element you want and the compose is built around composable fucntions.this functions let you define your app's UI programmatically beacuse they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI's construction, such as initializing an element and then attaching it to a parent.To create a composable function, you add the @Composable annotation to the function name  ",
                modifier = modifier.padding(4.dp),
                fontSize = 16.sp,
            )


    }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        Greeting("Android")
    }
}

@Composable
fun DisplayImage(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        // Centrer l'image
    ) {
        Image(
            painter = painterResource(id = R.drawable.compose), // Assurez-vous que 'compose' est bien dans res/drawable
            contentDescription = "My Image"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DisplayImagePreview() {
    DisplayImage()
}
