package com.ucb.ucbtest.socialpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.Unit

public val SocialPack.Telegram: ImageVector
    get() {
        if (_telegram != null) {
            return _telegram!!
        }
        _telegram = Builder(name = "Telegram", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 255.99f, viewportHeight = 255.99f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 5.33f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(31.09f, 125.95f)
                curveToRelative(67.03f, -29.49f, 153.77f, -65.44f, 165.74f, -70.42f)
                curveToRelative(31.41f, -13.02f, 41.05f, -10.53f, 36.24f, 18.31f)
                curveToRelative(-3.45f, 20.73f, -13.41f, 89.37f, -21.34f, 132.09f)
                curveToRelative(-4.71f, 25.33f, -15.27f, 28.34f, -31.89f, 17.38f)
                curveToRelative(-7.99f, -5.27f, -48.31f, -31.94f, -57.07f, -38.2f)
                curveToRelative(-7.99f, -5.71f, -19.01f, -12.57f, -5.19f, -26.09f)
                curveToRelative(4.92f, -4.82f, 37.15f, -35.59f, 62.27f, -59.55f)
                curveToRelative(3.29f, -3.15f, -0.84f, -8.31f, -4.64f, -5.79f)
                curveToRelative(-33.85f, 22.45f, -80.78f, 53.61f, -86.76f, 57.66f)
                curveToRelative(-9.02f, 6.13f, -17.69f, 8.94f, -33.25f, 4.47f)
                curveToRelative(-11.75f, -3.38f, -23.24f, -7.4f, -27.71f, -8.94f)
                curveToRelative(-17.21f, -5.91f, -13.13f, -13.56f, 3.59f, -20.92f)
                close()
            }
        }
        .build()
        return _telegram!!
    }

private var _telegram: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = SocialPack.Telegram, contentDescription = "")
    }
}
