package com.example.PasanPortfolio.components

import androidx.compose.runtime.Composable
import com.example.PasanPortfolio.Styles.ThemeIconStyle
import com.example.PasanPortfolio.util.Dimens.ICON_SIZE
import com.example.PasanPortfolio.util.Dimens.ICON_SIZE_LG
import com.example.PasanPortfolio.util.Icon
import com.example.PasanPortfolio.util.IconButton
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.compose.ui.modifiers.zIndex
import com.varabyte.kobweb.compose.ui.styleModifier
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.px

@Composable
fun ThemeSwitchButton(
    colorMode: ColorMode,
    onClick: () -> Unit
) {
    val breakpoint = rememberBreakpoint()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .position(Position.Fixed)
            .zIndex(1)
            .styleModifier {
                property("pointer-events", "none")
            },
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.End
    ) {
        IconButton(
            modifier = ThemeIconStyle.toModifier()
                .margin(all = if (breakpoint > Breakpoint.SM) 24.px else 16.px)
                .styleModifier {
                    property("pointer-events", "auto")
                },
            colorMode = colorMode,
            icon = if (colorMode.isLight) Icon.SUN else Icon.MOON,
            iconSize = if (breakpoint > Breakpoint.SM) ICON_SIZE_LG.px else ICON_SIZE.px,
            onClick = onClick
        )
    }
}