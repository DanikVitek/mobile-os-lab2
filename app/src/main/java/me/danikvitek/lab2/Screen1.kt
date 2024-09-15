package me.danikvitek.lab2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import me.danikvitek.lab2.ui.theme.Lab2Theme

@Composable
fun Screen1(
    modifier: Modifier = Modifier,
    onNavigateToScreen2: () -> Unit = {},
    onNavigateToScreen3: () -> Unit = {},
    onNavigateToScreen4: () -> Unit = {},
    onExit: () -> Unit = {},
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(0.02.dh, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        val btnModifier = Modifier
            .width(0.75.dw)
            .height(0.2.dw)

        Button(
            onClick = { onNavigateToScreen2() },
            modifier = btnModifier,
        ) {
            Text(
                text = stringResource(R.string.goto_screen_2),
                fontSize = 0.03.sh,
            )
        }
        Button(
            onClick = { onNavigateToScreen3() },
            modifier = btnModifier,
        ) {
            Text(
                text = stringResource(R.string.goto_screen_3),
                fontSize = 0.03.sh,
            )
        }
        Button(
            onClick = { onNavigateToScreen4() },
            modifier = btnModifier,
        ) {
            Text(
                text = stringResource(R.string.goto_screen_4),
                fontSize = 0.03.sh,
            )
        }
        Button(
            onClick = { onExit() },
            modifier = btnModifier,
        ) {
            Text(
                text = stringResource(R.string.exit),
                fontSize = 0.04.sh,
            )
        }
    }
}

@Preview
@Composable
private fun Screen1Preview() {
    Lab2Theme {
        Scaffold { innerPadding ->
            Screen1(
                modifier = Modifier.padding(innerPadding),
            )
        }
    }
}