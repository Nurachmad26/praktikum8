package com.example.praktikum8.ui.theme

import android.text.Layout.Alignment
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier

@Composable
fun HalamanSatu(
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
) {
    var nama by rememberSaveable { mutableListOf("") }
    var noTelp by remember { mutableListOf("") }
    var Alamat by remember { mutableListOf("") }
    var listData: MutableList<String> = mutableListOf(nama, noTelp, Alamat)
    
    Column {
        horizontalAlignment = Alignment.Center,
        modifier = Modifier.fillMaxWidth()
    ){
        
        OutlinedTextField(
            value = nama,
            onValueChange = { nama = it},
            label = { Text(text = "Nama")})
        OutlinedTextField(
            value = noTelp,
            onValueChange = { noTelp = it},
            label = { Text(text = "No Hp")})
        OutlinedTextField(
            value = Alamat,
            onValueChange = { Alamat = it},
            label = { Text(text = "Alamat")})
        Spacer(modifier = Modifier.padding(16.dp))
        Button(onClick = { onSubmitButtonClicked(listData) }) {
            Text(text = string)
        }
    }
}
