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

public val SocialPack.Twitterx: ImageVector
    get() {
        if (_twitterx != null) {
            return _twitterx!!
        }
        _twitterx = Builder(name = "Twitterx", defaultWidth = 50.0.dp, defaultHeight = 50.0.dp,
                viewportWidth = 255.99f, viewportHeight = 255.99f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 5.12f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(30.31f, 30.72f)
                lineToRelative(75.07f, 109.44f)
                lineToRelative(-73.48f, 85.12f)
                lineToRelative(16.28f, 0.0f)
                lineToRelative(64.39f, -74.64f)
                lineToRelative(51.2f, 74.64f)
                lineToRelative(61.51f, 0.0f)
                lineToRelative(-78.43f, -114.33f)
                lineToRelative(69.21f, -80.23f)
                lineToRelative(-16.23f, 0.0f)
                lineToRelative(-60.18f, 69.72f)
                lineToRelative(-47.83f, -69.72f)
                close()
                moveTo(49.75f, 40.96f)
                lineToRelative(36.68f, 0.0f)
                lineToRelative(119.41f, 174.08f)
                lineToRelative(-36.68f, 0.0f)
                close()
            }
        }
        .build()
        return _twitterx!!
    }

private var _twitterx: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = SocialPack.Twitterx, contentDescription = "")
    }
}
