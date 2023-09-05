package com.gardner.fragmenttocompose.ui.composable

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

@Composable
fun ComposeTheme(content: @Composable () -> Unit) {
    val isDarkTheme = isSystemInDarkTheme()
    val colors = if (isDarkTheme) darkColorScheme() else lightColorScheme()
    
    MaterialTheme(colorScheme = colors) {
        content()
    }
}