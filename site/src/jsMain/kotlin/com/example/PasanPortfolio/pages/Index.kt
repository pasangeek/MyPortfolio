package com.example.PasanPortfolio.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.margin
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.flexWrap
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.icons.fa.FaFaceSmileBeam
import com.varabyte.kobweb.silk.components.icons.fa.FaFacebook
import com.varabyte.kobweb.silk.components.icons.fa.FaMoon
import com.varabyte.kobweb.silk.components.icons.fa.FaSun
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.icons.fa.IconStyle
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.FlexWrap
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun HomePage()  {
    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Row(Modifier.align(Alignment.End)) {
            var colorMode by ColorMode.currentState
            Button(
                onClick = { colorMode = colorMode.opposite },
                Modifier.borderRadius(50.percent).padding(0.px)
            ) {
                // Includes support for Font Awesome icons
                if (colorMode.isLight) FaMoon() else FaSun()
            }
        }
        H1 {
            Text("Welcome to Kobweb!")
        }
        Row(Modifier.flexWrap(FlexWrap.Wrap)) {
            SpanText("Create rich, dynamic web apps with ease, leveraging ")
            Link("https://kotlinlang.org/", "Kotlin")
            SpanText(" and ")
            Link("https://github.com/JetBrains/compose-multiplatform/#compose-html", "Compose HTML")
        }
    }
}