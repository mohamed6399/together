package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
    val scrollState = rememberScrollState()

    Box(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(scrollState), // Ajout de défilement vertical
        contentAlignment = Alignment.TopCenter // Alignement centré en haut
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally, // Aligne les textes au centre horizontalement
           // Ajoute du padding général autour de la colonne
        ) {
            DisplayImage(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp) // Limite la hauteur de l'image
            )

            Spacer(modifier = Modifier.height(16.dp)) // Espace entre l'image et le texte

            Text(
                text = "Jetpack Compose Tutorial",
                modifier = Modifier
                    .padding( horizontal = 12.dp), // Ajout de padding à gauche et à droite
                fontSize = 24.sp,
                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(13.dp)) // Espace entre le titre et le paragraphe

            Text(
                text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates the development of Android apps with less code, powerful tools, and intuitive Kotlin APIs.",
                modifier = Modifier
                    .padding(horizontal = 14.dp), // Ajout de padding à gauche et à droite
                fontSize = 16.sp,
            )

            Spacer(modifier = Modifier.height(18.dp)) // Espace entre les paragraphes

            Text(
                text = "In this tutorial, you build a simple UI component with declarative functions. You call compose functions to specify what elements you want, and Compose is built around composable functions. These functions let you define your app's UI programmatically because they allow you to describe how it should look and provide data dependencies, rather than focusing on the process of the UI's construction.",
                modifier = Modifier
                    .padding(horizontal = 14.dp), // Ajout de padding à gauche et à droite
                fontSize = 16.sp,
            )



            Text(
                text = "To create a composable function, you add the @Composable annotation to the function name.",
                modifier = Modifier
                    .padding(horizontal = 14.dp), // Ajout de padding à gauche et à droite
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
        contentAlignment = Alignment.Center // Centrer l'image
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
