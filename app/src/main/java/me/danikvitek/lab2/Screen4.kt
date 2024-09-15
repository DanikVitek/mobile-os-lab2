package me.danikvitek.lab2

import androidx.annotation.ColorRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import me.danikvitek.lab2.ui.theme.Lab2Theme

@Composable
fun Screen4(modifier: Modifier = Modifier) {
    @ColorRes var buttonColor: Int by remember { mutableIntStateOf(R.color.green_700) }
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Button(
            onClick = { buttonColor = R.color.green_300 },
            border = BorderStroke(
                width = dimensionResource(R.dimen.screen4_button_border_width),
                color = colorResource(R.color.screen4_button_border_color),
            ),
            shape = RoundedCornerShape(24.dp),
            colors = ButtonDefaults.buttonColors().copy(
                containerColor = colorResource(buttonColor),
            ),
            modifier = Modifier.height(80.dp),
        ) {
            Text(text = "New Button")
        }
    }
}

@Preview
@Composable
private fun Screen4Preview() {
    Lab2Theme {
        Scaffold { innerPadding ->
            Screen4(modifier = Modifier.padding(innerPadding))
        }
    }
}