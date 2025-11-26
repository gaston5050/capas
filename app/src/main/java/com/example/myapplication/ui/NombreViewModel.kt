package com.example.myapplication.ui

import androidx.lifecycle.ViewModel
import com.example.myapplication.data.datos

class NombreViewModel : ViewModel() {

    private fun elegirNombreAlAzar(): String {
        // Continue picking up a new random word until you get one that hasn't been used before
        return datos.random()

    }


}