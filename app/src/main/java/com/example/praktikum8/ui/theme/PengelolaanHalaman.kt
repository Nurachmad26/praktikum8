package com.example.praktikum8.ui.theme

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import java.security.AccessController

enum class PengelolaanHalaman {
    Formulir,
    Detail
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun ContactApp(
    viewModel: ContactViewModel = viewModel(),
    nevController: NavHostController = rememberNavController()
){
    Scaffold { innerPadding ->
        val uiState by viewModel.stateUI.collectAsState()
        NavHost(
            navController = navController,
            startDestination = PengelolaanHalaman.Formulir.name,
            modifier = Modifier.padding(innerPadding)
        ){
            composable(PengelolaanHalaman.Formulir.name){
                HalamanSatu(
                    onSubmitButtonClicked = {
                        viewModel.setConcat(it)
                        nevController.navigate(PengelolaanHalaman.Detail.name)
                    }
                }
            }
            composable(PengelolaanHalaman.Detail.name)
        }
    }
}