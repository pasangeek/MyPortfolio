package com.example.PasanPortfolio.components

import androidx.compose.runtime.Composable
import com.example.PasanPortfolio.util.Dimens
import com.example.PasanPortfolio.util.Theme
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.boxShadow
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun Prifile(colorMode: ColorMode) {
    val breakpoint = rememberBreakpoint()
    SimpleGrid(
    numColumns = numColumns(base = 1, md = 2),
    modifier = Modifier
    .fillMaxWidth(
    if (breakpoint <= Breakpoint.MD) 100.percent
    else Dimens.MAX_CARD_WIDTH.px
    )
    .thenIf(
    condition = breakpoint > Breakpoint.MD,
    other = Modifier.height(Dimens.MAX_CARD_HEIGHT.px)
    )
    .boxShadow(
    color = Colors.Black.copy(alpha = 10),
    blurRadius = 50.px,
    spreadRadius = 50.px
    )
    .padding(all = 12.px)
    .borderRadius(r = Dimens.BORDER_RADIUS.px)
    .background(
    if (colorMode.isLight) Colors.White else
    Theme.DARK_BLUE.color
    )
    ) {
        LeftSide(colorMode = colorMode, breakpoint = breakpoint)
        RightSide(breakpoint = breakpoint)
    }
}