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

public val SocialPack.Messenger: ImageVector
    get() {
        if (_messenger != null) {
            return _messenger!!
        }
        _messenger = Builder(name = "Messenger", defaultWidth = 50.0.dp, defaultHeight = 50.0.dp,
                viewportWidth = 255.99f, viewportHeight = 255.99f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 5.12f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 10.24f)
                curveToRelative(-65.02f, 0.0f, -117.76f, 49.16f, -117.76f, 110.08f)
                curveToRelative(0.0f, 32.26f, 14.84f, 62.46f, 40.96f, 83.46f)
                lineToRelative(0.0f, 45.06f)
                lineToRelative(44.04f, -23.04f)
                curveToRelative(10.74f, 3.06f, 21.5f, 4.08f, 32.76f, 4.08f)
                curveToRelative(65.02f, 0.0f, 117.76f, -49.14f, 117.76f, -110.08f)
                curveToRelative(0.0f, -60.4f, -52.74f, -109.56f, -117.76f, -109.56f)
                close()
                moveTo(139.78f, 156.68f)
                lineToRelative(-29.7f, -31.76f)
                lineToRelative(-55.3f, 31.24f)
                lineToRelative(61.44f, -65.02f)
                lineToRelative(30.22f, 30.2f)
                lineToRelative(53.76f, -30.2f)
                close()
            }
        }
        .build()
        return _messenger!!
    }

private var _messenger: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = SocialPack.Messenger, contentDescription = "")
    }
}
