package com.example.myapplication.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myapplication.ui.NombreViewModel



@Composable
fun Pantalla(nombreViewModel: NombreViewModel = viewModel()) {

    val nombreUiEstado by nombreViewModel.uiEstado.collectAsState()
  //  val nombre = nombreUiEstado.nombre

    Column(modifier = Modifier.fillMaxWidth(). fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Card(modifier = Modifier.padding(10.dp)) {

            Text(text = nombreUiEstado.nombre, modifier = Modifier.padding(10.dp))
        }
        OutlinedButton(onClick = { nombreViewModel.elegirNombreAlAzar() }) {
            Text(text = "Cambiar nombre")
        }

    }
}