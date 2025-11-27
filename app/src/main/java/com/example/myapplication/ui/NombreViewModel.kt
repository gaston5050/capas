package com.example.myapplication.ui

import androidx.lifecycle.ViewModel
import com.example.myapplication.data.datos
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class NombreViewModel : ViewModel() {

    // Nombre UI Estado

    //Creo un MutableStateFlow que es el flujo de  datos que puede cambiar
        private val _uiEstado = MutableStateFlow(NombreEstado())

    //Convierto el flujo de arriba en un StateFlow que no puede cambiar
        val uiEstado: StateFlow<NombreEstado> = _uiEstado.asStateFlow()


    fun elegirNombreAlAzar() {

        _uiEstado.value = NombreEstado(datos.random())

    }


}