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

public val SocialPack.Snapchat: ImageVector
    get() {
        if (_snapchat != null) {
            return _snapchat!!
        }
        _snapchat = Builder(name = "Snapchat", defaultWidth = 50.0.dp, defaultHeight = 50.0.dp,
                viewportWidth = 255.99f, viewportHeight = 255.99f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 5.12f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(239.48f, 179.6f)
                curveToRelative(-29.72f, -4.9f, -43.3f, -35.68f, -43.74f, -36.68f)
                curveToRelative(-0.06f, -0.18f, -0.2f, -0.5f, -0.28f, -0.68f)
                curveToRelative(-0.9f, -1.8f, -1.8f, -4.34f, -1.04f, -6.14f)
                curveToRelative(1.3f, -3.08f, 7.48f, -5.04f, 11.18f, -6.22f)
                curveToRelative(1.3f, -0.42f, 2.54f, -0.8f, 3.5f, -1.18f)
                curveToRelative(8.98f, -3.56f, 13.46f, -8.2f, 13.36f, -13.84f)
                curveToRelative(-0.08f, -4.54f, -3.56f, -8.7f, -8.68f, -10.5f)
                curveToRelative(-1.78f, -0.76f, -3.82f, -1.14f, -5.88f, -1.14f)
                curveToRelative(-1.4f, 0.0f, -3.52f, 0.2f, -5.56f, 1.14f)
                curveToRelative(-3.42f, 1.6f, -6.42f, 2.46f, -8.56f, 2.56f)
                curveToRelative(-0.46f, -0.02f, -0.86f, -0.06f, -1.2f, -0.12f)
                lineToRelative(0.22f, -3.52f)
                curveToRelative(1.0f, -15.92f, 2.26f, -35.76f, -3.12f, -47.82f)
                curveToRelative(-15.88f, -35.54f, -49.52f, -38.3f, -59.46f, -38.3f)
                lineToRelative(-4.52f, 0.04f)
                curveToRelative(-9.92f, 0.0f, -43.5f, 2.76f, -59.34f, 38.28f)
                curveToRelative(-5.38f, 12.06f, -4.14f, 31.88f, -3.12f, 47.82f)
                lineToRelative(0.04f, 0.6f)
                curveToRelative(0.06f, 0.98f, 0.12f, 1.96f, 0.18f, 2.9f)
                curveToRelative(-2.22f, 0.4f, -6.56f, -0.34f, -11.06f, -2.44f)
                curveToRelative(-6.12f, -2.86f, -17.14f, 0.92f, -18.66f, 8.92f)
                curveToRelative(-0.68f, 3.54f, 0.14f, 10.26f, 13.18f, 15.4f)
                curveToRelative(0.98f, 0.4f, 2.2f, 0.78f, 3.52f, 1.2f)
                curveToRelative(3.68f, 1.18f, 9.86f, 3.12f, 11.16f, 6.22f)
                curveToRelative(0.76f, 1.8f, -0.14f, 4.34f, -1.2f, 6.52f)
                curveToRelative(-0.56f, 1.3f, -14.06f, 32.08f, -43.84f, 36.98f)
                curveToRelative(-3.8f, 0.62f, -6.5f, 3.98f, -6.3f, 7.86f)
                curveToRelative(0.06f, 1.02f, 0.32f, 2.04f, 0.74f, 3.04f)
                curveToRelative(2.7f, 6.34f, 12.52f, 10.7f, 30.84f, 13.68f)
                curveToRelative(0.32f, 1.08f, 0.68f, 2.68f, 0.88f, 3.56f)
                curveToRelative(0.38f, 1.82f, 0.8f, 3.66f, 1.36f, 5.58f)
                curveToRelative(0.54f, 1.82f, 2.4f, 6.04f, 8.2f, 6.04f)
                curveToRelative(1.76f, 0.0f, 3.68f, -0.38f, 5.74f, -0.78f)
                curveToRelative(3.04f, -0.6f, 6.84f, -1.34f, 11.72f, -1.34f)
                curveToRelative(2.72f, 0.0f, 5.52f, 0.24f, 8.34f, 0.7f)
                curveToRelative(5.2f, 0.86f, 9.9f, 4.2f, 15.36f, 8.04f)
                curveToRelative(8.52f, 6.04f, 18.18f, 12.86f, 33.16f, 12.86f)
                curveToRelative(0.4f, 0.0f, 0.8f, -0.02f, 1.18f, -0.04f)
                curveToRelative(0.54f, 0.02f, 1.1f, 0.04f, 1.66f, 0.04f)
                curveToRelative(14.98f, 0.0f, 24.64f, -6.84f, 33.18f, -12.86f)
                curveToRelative(5.2f, -3.7f, 10.12f, -7.16f, 15.34f, -8.04f)
                curveToRelative(2.82f, -0.46f, 5.62f, -0.7f, 8.34f, -0.7f)
                curveToRelative(4.7f, 0.0f, 8.42f, 0.6f, 11.74f, 1.26f)
                curveToRelative(2.36f, 0.46f, 4.24f, 0.68f, 5.98f, 0.68f)
                curveToRelative(3.88f, 0.0f, 6.86f, -2.22f, 7.94f, -5.94f)
                curveToRelative(0.56f, -1.88f, 0.96f, -3.7f, 1.36f, -5.54f)
                curveToRelative(0.16f, -0.68f, 0.54f, -2.4f, 0.88f, -3.54f)
                curveToRelative(18.32f, -2.98f, 28.14f, -7.34f, 30.82f, -13.62f)
                curveToRelative(0.44f, -1.0f, 0.68f, -2.04f, 0.76f, -3.12f)
                curveToRelative(0.2f, -3.82f, -2.5f, -7.18f, -6.3f, -7.82f)
                close()
            }
        }
        .build()
        return _snapchat!!
    }

private var _snapchat: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = SocialPack.Snapchat, contentDescription = "")
    }
}
