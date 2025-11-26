package com.example.myapplication.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.NombreViewModel


@Composable
fun Pantalla() {
    val nombreUiEstado by NombreViewModel.uiState.collectAsState()
    val nombre = nombreUiEstado.nombre

    Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Card(modifier = Modifier.padding(10.dp)) {
            Text(text = "Hola!!!!", modifier = Modifier.padding(10.dp))
        }
        OutlinedButton(onClick = { elegirNombreAlAzar()}) {
            Text(text = "Cambiar nombre")
        }

    }
}