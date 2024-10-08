package com.example.PasanPortfolio.Styles

import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

val ButtonStyle by ComponentStyle {
    base {
        Modifier
            .padding(leftRight = 12.px)
            .transition(CSSTransition("all", 300.ms))
    }
    hover {
        Modifier
            .padding(leftRight = 20.px)
    }
}