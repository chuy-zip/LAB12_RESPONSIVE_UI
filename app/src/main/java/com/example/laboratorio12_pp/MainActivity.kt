package com.example.laboratorio12_pp

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.platform.LocalContext
import com.example.laboratorio12_pp.ui.theme.Laboratorio12_PPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio12_PPTheme {
                val context = LocalContext.current
                ResponsiveBox(context)
            }
        }
    }
}