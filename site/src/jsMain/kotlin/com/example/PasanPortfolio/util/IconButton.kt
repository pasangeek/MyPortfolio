package com.example.PasanPortfolio.util

import androidx.compose.runtime.Composable
import com.example.PasanPortfolio.util.Dimens.BORDER_RADIUS
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.cursor
import com.varabyte.kobweb.compose.ui.modifiers.onClick
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import org.jetbrains.compose.web.css.CSSSizeValue
import org.jetbrains.compose.web.css.CSSUnit
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px
import kotlin.String

@Composable
fun IconButton(
    modifier: Modifier = Modifier,
    colorMode: ColorMode,
    link: String = "",
    icon: String,
    iconSize: CSSSizeValue<CSSUnit.px> = Dimens.ICON_SIZE.px,
    onClick: (() -> Unit)? = null
) {
    Link(path = link) {
        Box(
            modifier = modifier
                .padding(all = 8.px)
                .borderRadius(r = BORDER_RADIUS.px)
                .cursor(Cursor.Pointer)
                .border(
                    width = 1.px,
                    style = LineStyle.Solid,
                    color = if (colorMode.isLight) Theme.SOCIAL_ICON_BACKGROUND_LIGHT.color
                    else Theme.SOCIAL_ICON_BACKGROUND_DARK.color
                )
                .onClick { onClick?.invoke() }
        ){
            Image(
                modifier = Modifier.size(iconSize),
                src = icon
            )
        }
    }
}

enum class SocialIcon(
    val icon: String,
    val link: String
) {
    Github(
        icon = Icon.GITHUB,
        link = "https://github.com/pasangeek"
    ),
    GithubLight(
        icon = Icon.GITHUB_LIGHT,
        link = "https://github.com/pasangeek"
    ),
    Gitlab(
        icon = Icon.GITLAB,
        link = "https://gitlab.com"
    ),
    GitlabLight(
        icon = Icon.GITLAB_LIGHT,
        link = "https://gitlab.com"
    ),
    Instagram(
        icon = Icon.INSTAGRAM,
        link = "https://www.instagram.com/pasanwedikkara/"
    ),
    InstagramLight(
        icon = Icon.INSTAGRAM_LIGHT,
        link = "https://www.instagram.com/pasanwedikkara/"
    )
}
