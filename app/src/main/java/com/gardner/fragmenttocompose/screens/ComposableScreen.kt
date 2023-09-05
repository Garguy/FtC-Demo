package com.gardner.fragmenttocompose.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.gardner.fragmenttocompose.ui.composable.ComposeTheme

@Composable
fun ComposableScreen() {
    
    ComposeTheme {
        Box(modifier = Modifier.fillMaxSize()) {
            Text(
                text = "Hello Compose",
                modifier = Modifier.align(Alignment.Center),
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CenteredTextPreview() {
    Surface(color = Color.White) {
        ComposableScreen()
    }
}