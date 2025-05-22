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

public val SocialPack.Instagram: ImageVector
    get() {
        if (_instagram != null) {
            return _instagram!!
        }
        _instagram = Builder(name = "Instagram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 255.99f, viewportHeight = 255.99f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 10.67f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(85.33f, 32.0f)
                curveToRelative(-29.41f, 0.0f, -53.33f, 23.93f, -53.33f, 53.33f)
                lineToRelative(0.0f, 85.33f)
                curveToRelative(0.0f, 29.41f, 23.93f, 53.33f, 53.33f, 53.33f)
                lineToRelative(85.33f, 0.0f)
                curveToRelative(29.41f, 0.0f, 53.33f, -23.93f, 53.33f, -53.33f)
                lineToRelative(0.0f, -85.33f)
                curveToRelative(0.0f, -29.41f, -23.93f, -53.33f, -53.33f, -53.33f)
                close()
                moveTo(85.33f, 53.33f)
                lineToRelative(85.33f, 0.0f)
                curveToRelative(17.64f, 0.0f, 32.0f, 14.36f, 32.0f, 32.0f)
                lineToRelative(0.0f, 85.33f)
                curveToRelative(0.0f, 17.64f, -14.36f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-85.33f, 0.0f)
                curveToRelative(-17.64f, 0.0f, -32.0f, -14.36f, -32.0f, -32.0f)
                lineToRelative(0.0f, -85.33f)
                curveToRelative(0.0f, -17.64f, 14.36f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(181.33f, 64.0f)
                curveToRelative(-5.89f, 0.0f, -10.67f, 4.78f, -10.67f, 10.67f)
                curveToRelative(0.0f, 5.89f, 4.78f, 10.67f, 10.67f, 10.67f)
                curveToRelative(5.89f, 0.0f, 10.67f, -4.78f, 10.67f, -10.67f)
                curveToRelative(0.0f, -5.89f, -4.78f, -10.67f, -10.67f, -10.67f)
                close()
                moveTo(128.0f, 74.67f)
                curveToRelative(-29.41f, 0.0f, -53.33f, 23.93f, -53.33f, 53.33f)
                curveToRelative(0.0f, 29.41f, 23.93f, 53.33f, 53.33f, 53.33f)
                curveToRelative(29.41f, 0.0f, 53.33f, -23.93f, 53.33f, -53.33f)
                curveToRelative(0.0f, -29.41f, -23.93f, -53.33f, -53.33f, -53.33f)
                close()
                moveTo(128.0f, 96.0f)
                curveToRelative(17.64f, 0.0f, 32.0f, 14.36f, 32.0f, 32.0f)
                curveToRelative(0.0f, 17.64f, -14.36f, 32.0f, -32.0f, 32.0f)
                curveToRelative(-17.64f, 0.0f, -32.0f, -14.36f, -32.0f, -32.0f)
                curveToRelative(0.0f, -17.64f, 14.36f, -32.0f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _instagram!!
    }

private var _instagram: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = SocialPack.Instagram, contentDescription = "")
    }
}
