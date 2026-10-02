package com.example.proiektuapmd.ui.pantailak

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun LoginPantaila(navController: NavController) {

    var erabiltzailea by remember { mutableStateOf("") }
    var pasahitza by remember { mutableStateOf("") }
    var errorea by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Txurdiko Gimnasioa"
        )

        Text(
            text = "Saio-hasiera"
        )

        OutlinedTextField(
            value = erabiltzailea,
            onValueChange = {
                erabiltzailea = it
            },
            label = {
                Text("Erabiltzailea")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        )

        OutlinedTextField(
            value = pasahitza,
            onValueChange = {
                pasahitza = it
            },
            label = {
                Text("Pasahitza")
            },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
        )

        Button(
            onClick = {

                if (erabiltzailea.isEmpty() || pasahitza.isEmpty()) {

                    errorea = "Bete erabiltzailea eta pasahitza"

                } else if (
                    erabiltzailea == "super@super.gmail" &&
                    pasahitza == "super"
                ) {

                    errorea = ""

                    navController.navigate("gimnasio")

                } else {

                    errorea = "Erabiltzailea edo pasahitza okerra da"
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        ) {
            Text("Sartu")
        }

        if (errorea.isNotEmpty()) {
            Text(
                text = errorea,
                modifier = Modifier.padding(top = 15.dp)
            )
        }
    }
}