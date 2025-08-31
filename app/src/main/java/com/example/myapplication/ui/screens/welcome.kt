package com.example.myapplication.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.R

@Composable
fun WelcomeScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp)
            .padding(top = 16.dp)
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(52.dp))

            Image(
                painter = painterResource(id = R.drawable.welcome_image),
                contentDescription = "Welcome illustration",
                modifier = Modifier
                    .fillMaxWidth() // Para ocupar todo el ancho de la app
                    .height(422.dp) // Para obtener la altura exacta
            )

            // Un Spacer para dejar el texto a la posición deseada
            // Calculamos la distancia restante (496 - 16 - 52 - 422)
            // O pedimos a alguna IA que lo haga con las medidas de figma
            Spacer(modifier = Modifier.height(6.dp))

            // Título
            Text(
                "Discover Your\nDream Job here",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF0D47A1),
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

            // Subtítulo
            Text(
                "Explore all the existing job roles based on your interest and study major",
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
            )

            // Separador para dejar los botones mas abajo
            Spacer(modifier = Modifier.weight(1f))

            // Botones
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 32.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Botón de Login
                Button(
                    onClick = { navController.navigate("login") },
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1F41BB)),
                    modifier = Modifier
                        .height(60.dp)
                        .weight(1f)
                ) {
                    Text(
                        "Login",
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }

                // Espaciado entre botones
                Spacer(modifier = Modifier.width(30.dp))

                // Texto de Register
                TextButton(
                    onClick = { navController.navigate("register") },
                    modifier = Modifier
                        .height(60.dp)
                        .weight(1f)
                ) {
                    Text(
                        "Register",
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen(rememberNavController())
}