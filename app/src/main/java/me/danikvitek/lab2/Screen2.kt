package me.danikvitek.lab2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import me.danikvitek.lab2.ui.theme.Lab2Theme

@Composable
fun Screen2(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth(1f / 3f)
                    .padding(horizontal = 2.dp),
            ) { Text(text = "Button1") }
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(horizontal = 2.dp),
            ) { Text(text = "Button2") }
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 2.dp),
            ) { Text(text = "Button3") }
        }
        Row(
            modifier = Modifier.fillMaxWidth(0.8f),
            horizontalArrangement = Arrangement.Center,
        ) {
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(horizontal = 2.dp),
            ) { Text(text = "Button4") }
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 2.dp),
            ) { Text(text = "Button5") }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth(0.25f)
                    .padding(horizontal = 2.dp),
                contentPadding = PaddingValues(horizontal = 0.dp)
            ) { Text(text = "Button6") }
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth(1f / 3f)
                    .padding(horizontal = 2.dp),
                contentPadding = PaddingValues(horizontal = 0.dp)
            ) { Text(text = "Button7") }
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 2.dp),
            ) { Text(text = "Button8") }
        }
    }
}

@Preview
@Composable
private fun Screen2Preview() {
    Lab2Theme {
        Scaffold { innerPadding ->
            Screen2(modifier = Modifier.padding(innerPadding))
        }
    }
}