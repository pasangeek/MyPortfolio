package com.example.PasanPortfolio.util

import com.varabyte.kobweb.compose.ui.graphics.Color

enum class Theme(val color: Color) {
    BLUE(color = Color.rgb(r = 33, g = 150, b = 243)),
    LIGHT_BLUE(color = Color.rgb(r = 168, g = 236, b = 255)),
    DARK_BLUE(color = Color.rgb(r = 34, g = 63, b = 94)),
    SOCIAL_ICON_BACKGROUND_LIGHT(color = Color.rgb(r = 230, g = 230, b = 230)),
    SOCIAL_ICON_BACKGROUND_DARK(color = Color.rgb(r = 48, g = 82, b = 118)),
    GRADIENT_ONE(color = Color.rgb(r = 161, g = 196, b = 253)),
    GRADIENT_ONE_DARK(color = Color.rgb(r = 19, g = 38, b = 58)),
    GRADIENT_TWO(color = Color.rgb(r = 194, g = 233, b = 251)),
    GRADIENT_TWO_DARK(color = Color.rgb(r = 20, g = 46, b = 73))
}