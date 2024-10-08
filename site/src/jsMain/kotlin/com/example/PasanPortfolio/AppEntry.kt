package com.example.PasanPortfolio

import androidx.compose.runtime.Composable
import com.example.PasanPortfolio.util.Res
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.theme.colors.palette.button
import org.jetbrains.compose.web.css.vh

@App
@Composable
fun AppEntry(content: @Composable () -> Unit) {
    SilkApp {
        Surface(SmoothColorStyle.toModifier().minHeight(100.vh)) {
            content()
        }
    }
}
@InitSilk
fun overrideSilkTheme(context: InitSilkContext) {
    context.apply {
        theme.palettes.apply {
            light.apply {
                button.apply {
                    default = Res.Theme.BLUE.color
                    hover = Res.Theme.BLUE.color
                    pressed = Res.Theme.BLUE.color
                }
            }

            dark.apply {
                button.apply {
                    default = Res.Theme.LIGHT_BLUE.color
                    hover = Res.Theme.LIGHT_BLUE.color
                    pressed = Res.Theme.LIGHT_BLUE.color
                }
            }
        }
    }
}