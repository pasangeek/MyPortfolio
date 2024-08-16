package com.example.PasanPortfolio.components

import androidx.compose.runtime.Composable
import com.example.PasanPortfolio.Styles.SocialIconStyle
import com.example.PasanPortfolio.util.Icon
import com.example.PasanPortfolio.util.IconButton
import com.example.PasanPortfolio.util.SocialIcon
import com.example.PasanPortfolio.util.String
import com.example.PasanPortfolio.util.Theme
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextAlign
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.lineHeight
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.textAlign
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.forms.ButtonStyle
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import kotlinx.browser.window
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun LeftSide(
    colorMode: ColorMode,
    breakpoint: Breakpoint
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(all = 50.px),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = if (breakpoint <= Breakpoint.SM)
                Alignment.CenterHorizontally else Alignment.Start
        ) {
            SpanText(
                text = String.NAME,
                modifier = Modifier
                    .margin(bottom = 12.px)
                    .fontFamily(String.FONTBOLD)
                    .color(if (colorMode.isLight) Colors.Black else Colors.White)
                    .fontSize(50.px)
                    .fontWeight(FontWeight.Bold)
                    .textAlign(
                        if (breakpoint <= Breakpoint.SM) TextAlign.Center
                        else TextAlign.Start
                    )
            )
            SpanText(
                text = String.PROFESSION,
                modifier = Modifier
                    .margin(bottom = 24.px)
                    .fontFamily(String.FONTREGULER)
                    .color(if (colorMode.isLight) Colors.Black else Colors.White)
                    .fontSize(18.px)
            )
            Surface(
                modifier = Modifier
                    .height(4.px)
                    .width(40.px)
                    .margin(bottom = 24.px)
                    .background(
                        if (colorMode.isLight) Theme.BLUE.color
                        else Theme.LIGHT_BLUE.color
                    )
                    .align(
                        if (breakpoint <= Breakpoint.SM) Alignment.CenterHorizontally
                        else Alignment.Start
                    )
            ) {}
            SpanText(
                modifier = Modifier
                    .fontFamily(String.FONTREGULER)
                    .fontSize(14.px)
                    .color(if (colorMode.isLight) Colors.Black else Colors.White)
                    .opacity(50.percent)
                    .lineHeight(2)
                    .margin(bottom = 36.px)
                    .textAlign(
                        if (breakpoint <= Breakpoint.SM) TextAlign.Center
                        else TextAlign.Start
                    ),
                text = String.ABOUT_ME
            )
            Button(
                modifier = com.example.PasanPortfolio.Styles.ButtonStyle.toModifier()
                    .margin(bottom = 50.px),
                size = ButtonSize.LG,
                onClick = { window.location.href = String.MY_EMAIL }
            ) {
                Image(
                    modifier = Modifier.margin(right = 12.px),
                    src = if (colorMode.isLight) Icon.EMAIL_LIGHT
                    else Icon.EMAIL_DARK
                )
                SpanText(
                    modifier = Modifier
                        .fontSize(14.px)
                        .color(
                            if (colorMode.isLight) Colors.White
                            else Theme.GRADIENT_ONE_DARK.color
                        )
                        .fontWeight(FontWeight.Bold)
                        .fontFamily(String.FONTREGULER),
                    text = String.BUTTON_TEXT
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .gap(12.px),
                horizontalArrangement = if (breakpoint <= Breakpoint.SM)
                    Arrangement.Center else Arrangement.Start
            ) {
                SocialIcon.entries.filter {
                    if (colorMode.isLight) !it.name.contains("Light")
                    else it.name.contains("Light")
                }.forEach {
                    IconButton(
                        modifier = SocialIconStyle.toModifier(),
                        colorMode = colorMode,
                        icon = it.icon,
                        link = it.link
                    )
                }
            }
        }
}