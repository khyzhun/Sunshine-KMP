package org.khyzhun.sunshine

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SunshineAppView()
        }
    }
}

actual fun getPlatformName(): String = "Android"

actual fun setupLogger() {
    Napier.base(DebugAntilog())
}

@Preview
@Composable
fun AppAndroidPreview() {
    SunshineAppView()
}
