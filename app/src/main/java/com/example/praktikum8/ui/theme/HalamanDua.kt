package com.example.praktikum8.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun HalamanDua(
        contactUIState: ContactUIState,
        onBackButtonClicked: () -> Unit,
) {
    Column (
        verticalArrangement = Arrangement.Center,

        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ){
        Text(text = "Nama")
        Text(text = contactUIState.nama)
        Divider()
        Spacer(modifier = Modifier.padding(16.dp))
        Text(text = "No Telp")
        Text(text = contactUIState.noTelp)
        Spacer(modifier = Modifier.padding(16.dp))
        Text(text = "Alamat")
        Text(text = contactUIState.Alamay)
        Spacer(modifier = Modifier.padding(16.dp))
        Row {
            Button(onClick = onBackButtonClicked) {
                Text(text = stringResource(id = R.string.btn_back))
            }
        }
    }
}