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

public val SocialPack.Whatsapp: ImageVector
    get() {
        if (_whatsapp != null) {
            return _whatsapp!!
        }
        _whatsapp = Builder(name = "Whatsapp", defaultWidth = 50.0.dp, defaultHeight = 50.0.dp,
                viewportWidth = 255.99f, viewportHeight = 255.99f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 5.12f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 10.24f)
                curveToRelative(-64.98f, 0.0f, -117.76f, 52.78f, -117.76f, 117.76f)
                curveToRelative(0.0f, 20.88f, 5.73f, 40.38f, 15.28f, 57.39f)
                lineToRelative(-15.09f, 53.87f)
                curveToRelative(-0.49f, 1.75f, -0.01f, 3.64f, 1.26f, 4.94f)
                curveToRelative(1.27f, 1.31f, 3.14f, 1.84f, 4.9f, 1.41f)
                lineToRelative(56.17f, -13.92f)
                curveToRelative(16.51f, 8.81f, 35.23f, 14.07f, 55.24f, 14.07f)
                curveToRelative(64.98f, 0.0f, 117.76f, -52.78f, 117.76f, -117.76f)
                curveToRelative(0.0f, -64.98f, -52.78f, -117.76f, -117.76f, -117.76f)
                close()
                moveTo(128.0f, 20.48f)
                curveToRelative(59.44f, 0.0f, 107.52f, 48.08f, 107.52f, 107.52f)
                curveToRelative(0.0f, 59.44f, -48.08f, 107.52f, -107.52f, 107.52f)
                curveToRelative(-19.06f, 0.0f, -36.9f, -4.97f, -52.42f, -13.65f)
                curveToRelative(-1.13f, -0.63f, -2.47f, -0.81f, -3.73f, -0.5f)
                lineToRelative(-49.19f, 12.19f)
                lineToRelative(13.19f, -47.06f)
                curveToRelative(0.38f, -1.34f, 0.2f, -2.79f, -0.51f, -3.99f)
                curveToRelative(-9.43f, -15.99f, -14.86f, -34.59f, -14.86f, -54.51f)
                curveToRelative(0.0f, -59.44f, 48.08f, -107.52f, 107.52f, -107.52f)
                close()
                moveTo(85.21f, 66.56f)
                curveToRelative(-3.28f, 0.0f, -7.97f, 1.22f, -11.82f, 5.37f)
                curveToRelative(-2.31f, 2.49f, -11.95f, 11.88f, -11.95f, 28.39f)
                curveToRelative(0.0f, 17.21f, 11.94f, 32.06f, 13.38f, 33.97f)
                lineToRelative(0.01f, 0.0f)
                lineToRelative(0.0f, 0.01f)
                curveToRelative(-0.14f, -0.18f, 1.83f, 2.67f, 4.46f, 6.09f)
                curveToRelative(2.63f, 3.42f, 6.3f, 7.91f, 10.92f, 12.77f)
                curveToRelative(9.23f, 9.72f, 22.22f, 20.96f, 38.33f, 27.83f)
                curveToRelative(7.42f, 3.16f, 13.27f, 5.07f, 17.71f, 6.46f)
                curveToRelative(8.22f, 2.58f, 15.71f, 2.19f, 21.33f, 1.36f)
                curveToRelative(4.21f, -0.62f, 8.84f, -2.64f, 13.42f, -5.54f)
                curveToRelative(4.58f, -2.9f, 9.07f, -6.5f, 11.05f, -11.98f)
                curveToRelative(1.42f, -3.93f, 2.14f, -7.55f, 2.4f, -10.54f)
                curveToRelative(0.13f, -1.49f, 0.15f, -2.81f, 0.05f, -4.03f)
                curveToRelative(-0.1f, -1.22f, 0.01f, -2.15f, -1.13f, -4.02f)
                curveToRelative(-2.38f, -3.91f, -5.08f, -4.02f, -7.9f, -5.41f)
                curveToRelative(-1.57f, -0.77f, -6.02f, -2.95f, -10.49f, -5.08f)
                curveToRelative(-4.46f, -2.13f, -8.33f, -4.01f, -10.71f, -4.86f)
                curveToRelative(-1.5f, -0.54f, -3.34f, -1.32f, -5.99f, -1.02f)
                curveToRelative(-2.65f, 0.3f, -5.27f, 2.21f, -6.79f, 4.47f)
                curveToRelative(-1.44f, 2.14f, -7.26f, 9.0f, -9.03f, 11.02f)
                curveToRelative(-0.02f, -0.01f, 0.13f, 0.06f, -0.57f, -0.29f)
                curveToRelative(-2.19f, -1.08f, -4.87f, -2.01f, -8.84f, -4.1f)
                curveToRelative(-3.97f, -2.09f, -8.93f, -5.18f, -14.36f, -9.97f)
                lineToRelative(0.0f, -0.01f)
                curveToRelative(-8.08f, -7.12f, -13.74f, -16.05f, -15.53f, -19.05f)
                curveToRelative(0.12f, -0.14f, -0.01f, 0.03f, 0.24f, -0.22f)
                lineToRelative(0.01f, -0.01f)
                curveToRelative(1.83f, -1.8f, 3.44f, -3.95f, 4.81f, -5.52f)
                curveToRelative(1.94f, -2.23f, 2.79f, -4.2f, 3.72f, -6.04f)
                curveToRelative(1.85f, -3.67f, 0.82f, -7.7f, -0.25f, -9.82f)
                lineToRelative(0.0f, -0.01f)
                curveToRelative(0.07f, 0.15f, -0.58f, -1.29f, -1.28f, -2.95f)
                curveToRelative(-0.7f, -1.66f, -1.6f, -3.82f, -2.56f, -6.12f)
                curveToRelative(-1.92f, -4.6f, -4.06f, -9.76f, -5.33f, -12.78f)
                lineToRelative(0.0f, -0.01f)
                curveToRelative(-1.5f, -3.56f, -3.53f, -6.12f, -6.18f, -7.36f)
                curveToRelative(-2.65f, -1.24f, -5.0f, -0.89f, -5.09f, -0.89f)
                lineToRelative(-0.01f, 0.0f)
                curveToRelative(-1.89f, -0.09f, -3.97f, -0.11f, -6.03f, -0.11f)
                close()
                moveTo(85.21f, 76.8f)
                curveToRelative(1.97f, 0.0f, 3.92f, 0.02f, 5.55f, 0.1f)
                curveToRelative(1.68f, 0.08f, 1.57f, 0.09f, 1.25f, -0.06f)
                curveToRelative(-0.33f, -0.15f, 0.12f, -0.2f, 1.07f, 2.06f)
                curveToRelative(1.25f, 2.96f, 3.4f, 8.14f, 5.32f, 12.75f)
                curveToRelative(0.96f, 2.31f, 1.86f, 4.47f, 2.58f, 6.17f)
                curveToRelative(0.72f, 1.7f, 1.11f, 2.65f, 1.56f, 3.55f)
                lineToRelative(0.0f, 0.01f)
                lineToRelative(0.01f, 0.01f)
                curveToRelative(0.44f, 0.87f, 0.4f, 0.31f, 0.25f, 0.62f)
                curveToRelative(-1.08f, 2.14f, -1.23f, 2.67f, -2.32f, 3.93f)
                curveToRelative(-1.66f, 1.92f, -3.36f, 4.06f, -4.26f, 4.94f)
                curveToRelative(-0.79f, 0.77f, -2.2f, 1.98f, -3.09f, 4.33f)
                curveToRelative(-0.89f, 2.36f, -0.47f, 5.59f, 0.95f, 8.01f)
                curveToRelative(1.89f, 3.22f, 8.14f, 13.38f, 17.84f, 21.92f)
                curveToRelative(6.11f, 5.39f, 11.8f, 8.95f, 16.35f, 11.35f)
                curveToRelative(4.55f, 2.4f, 8.25f, 3.8f, 9.08f, 4.21f)
                curveToRelative(1.97f, 0.97f, 4.12f, 1.73f, 6.62f, 1.43f)
                curveToRelative(2.5f, -0.3f, 4.66f, -1.82f, 6.03f, -3.37f)
                lineToRelative(0.01f, -0.01f)
                curveToRelative(1.83f, -2.07f, 7.26f, -8.27f, 9.86f, -12.09f)
                curveToRelative(0.11f, 0.04f, 0.07f, 0.01f, 0.94f, 0.32f)
                lineToRelative(0.0f, 0.01f)
                lineToRelative(0.01f, 0.0f)
                curveToRelative(0.4f, 0.14f, 5.35f, 2.36f, 9.76f, 4.46f)
                curveToRelative(4.41f, 2.1f, 8.89f, 4.29f, 10.35f, 5.01f)
                curveToRelative(2.1f, 1.04f, 3.09f, 1.72f, 3.35f, 1.72f)
                curveToRelative(0.02f, 0.45f, 0.03f, 0.94f, -0.03f, 1.68f)
                curveToRelative(-0.18f, 2.06f, -0.73f, 4.9f, -1.83f, 7.95f)
                curveToRelative(-0.54f, 1.49f, -3.35f, 4.57f, -6.89f, 6.81f)
                curveToRelative(-3.54f, 2.24f, -7.85f, 3.82f, -9.45f, 4.06f)
                curveToRelative(-4.8f, 0.71f, -10.5f, 0.97f, -16.76f, -1.0f)
                curveToRelative(-4.34f, -1.36f, -9.75f, -3.13f, -16.76f, -6.11f)
                curveToRelative(-14.21f, -6.06f, -26.29f, -16.38f, -34.92f, -25.46f)
                curveToRelative(-4.31f, -4.54f, -7.77f, -8.77f, -10.23f, -11.97f)
                curveToRelative(-2.45f, -3.19f, -3.53f, -4.85f, -4.42f, -6.03f)
                lineToRelative(-0.01f, -0.01f)
                curveToRelative(-1.59f, -2.1f, -11.3f, -15.61f, -11.3f, -27.78f)
                curveToRelative(0.0f, -12.88f, 5.98f, -17.93f, 9.22f, -21.42f)
                curveToRelative(1.7f, -1.83f, 3.56f, -2.1f, 4.31f, -2.1f)
                close()
            }
        }
        .build()
        return _whatsapp!!
    }

private var _whatsapp: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = SocialPack.Whatsapp, contentDescription = "")
    }
}
