package com.example.myapplication.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.myapplication.R

@Composable
fun LoginScreen(navController: NavHostController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 24.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Spacer para el espacio superior del encabezado
            Spacer(modifier = Modifier.height(97.dp))

            // Título principal
            Text(
                "Login here",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1F41BB),
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

            // Subtítulo
            Text(
                "Welcome back you've\nbeen missed!",
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
            )

            // Spacer para el espacio entre el encabezado y el formulario
            Spacer(modifier = Modifier.height(30.dp))

            // Campos de entrada
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Campo de email
                TextField(
                    value = email,
                    onValueChange = { email = it },
                    placeholder = { Text("Email") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(64.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color(0xFFE5E5E5),
                        disabledContainerColor = Color(0xFFE5E5E5),
                        focusedIndicatorColor = Color(0xFF1F41BB),
                        unfocusedIndicatorColor = Color.Transparent,
                    )
                )

                // Campo de contrasenia
                TextField(
                    value = password,
                    onValueChange = { password = it },
                    placeholder = { Text("Password") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(64.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color(0xFFE5E5E5),
                        disabledContainerColor = Color(0xFFE5E5E5),
                        focusedIndicatorColor = Color(0xFF1F41BB),
                        unfocusedIndicatorColor = Color.Transparent
                    )
                )

                // Botón "Forgot your password?"
                TextButton(
                    onClick = { /* Handle forgot password click */ },
                    modifier = Modifier.align(Alignment.End)
                ) {
                    Text(
                        "Forgot your password?",
                        color = Color(0xFF1F41BB),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }

            Spacer(modifier = Modifier.height(30.dp))

            // Botón de "Sign in"
            Button(
                onClick = { /* Handle sign in click */ },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1F41BB)),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
            ) {
                Text(
                    "Sign in",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            // Separador
            Spacer(modifier = Modifier.height(30.dp))

            // "Create new account"
            Text(
                "Create new account",
                color = Color.Black,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(top = 16.dp)
            )

            // Separador para empujar los iconos sociales abajo
            Spacer(modifier = Modifier.weight(1f))

            // Texto
            Text(
                "Or continue with",
                color = Color(0xFF0D47A1),
                fontSize = 14.sp,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Iconos de redes sociales
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 32.dp),
                horizontalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterHorizontally)
            ) {
                // Botón para Google
                IconButton(
                    onClick = { /* Lógica para iniciar sesión con Google */ },
                    modifier = Modifier.size(60.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.google),
                        contentDescription = "Sign in with Google",
                        modifier = Modifier.fillMaxSize()
                    )
                }

                // Botón para Facebook
                IconButton(
                    onClick = { /* Lógica para iniciar sesión con Facebook */ },
                    modifier = Modifier.size(60.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.facebook),
                        contentDescription = "Sign in with Facebook",
                        modifier = Modifier.fillMaxSize()
                    )
                }

                // Botón para Apple
                IconButton(
                    onClick = { /* Lógica para iniciar sesión con Apple */ },
                    modifier = Modifier.size(60.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.apple),
                        contentDescription = "Sign in with Apple",
                        modifier = Modifier.fillMaxSize()
                    )
                }
            }
        }
    }
}