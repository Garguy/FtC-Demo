package com.gardner.fragmenttocompose.ui

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

class ColorScheme {
    
    // Light Theme Colors
    val Purple200 = Color(0xFFBB86FC)
    val Purple500 = Color(0xFF6200EA)
    val Purple700 = Color(0xFF3700B3)
    val Teal200 = Color(0xFF03DAC6)
    val TextBlack = Color(0xFF000000)
    val BackgroundWhite = Color(0xFFFFFFFF)
    val SurfaceLight = Color(0xFFFAFAFA)
    
    val LightColorPalette = lightColorScheme(
        primary = Purple500,
        secondary = Teal200,
        background = BackgroundWhite,
        surface = SurfaceLight,
        onPrimary = Color.White,
        onSecondary = TextBlack,
        onBackground = TextBlack,
        onSurface = TextBlack,
        error = Color(0xFFB00020),
        onError = Color.White
    )
    
    // Dark Theme Colors
    val TextWhite = Color(0xFFFFFFFF)
    val BackgroundBlack = Color(0xFF121212)
    val SurfaceDark = Color(0xFF1F1F1F)
    
    val DarkColorPalette = darkColorScheme(
        primary = Purple200,
        secondary = Teal200,
        background = BackgroundBlack,
        surface = SurfaceDark,
        onPrimary = Color.Black,
        onSecondary = TextWhite,
        onBackground = TextWhite,
        onSurface = TextWhite,
        error = Color(0xFFCF6679),
        onError = Color.Black
    )
    
}