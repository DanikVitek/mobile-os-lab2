package me.danikvitek.lab2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
fun Screen3(modifier: Modifier = Modifier) {
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
                    .fillMaxWidth(0.5f)
                    .padding(horizontal = 2.dp),
            ) { Text(text = "Left 50%") }
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 2.dp),
            ) { Text(text = "Right 50%") }
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
        ) {
            Button(
                onClick = {},
                modifier = Modifier.padding(horizontal = 2.dp),
            ) { Text(text = "Center Left") }
            Button(
                onClick = {},
                modifier = Modifier.padding(horizontal = 2.dp),
            ) { Text(text = "Center") }
            Button(
                onClick = {},
                modifier = Modifier.padding(horizontal = 2.dp),
            ) { Text(text = "Center Right") }
        }
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 2.dp),
        ) {
            Text(text = "Bottom")
        }
    }
}

@Preview
@Composable
private fun Screen3Preview() {
    Lab2Theme {
        Scaffold { innerPadding ->
            Screen3(modifier = Modifier.padding(innerPadding))
        }
    }
}