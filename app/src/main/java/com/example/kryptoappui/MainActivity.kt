package com.example.kryptoappui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.kryptoappui.ui.screens.BottomBar
import com.example.kryptoappui.ui.screens.HomeScreen
import com.example.kryptoappui.ui.screens.TitleBar
import com.example.kryptoappui.ui.theme.KryptoAppUiTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KryptoAppUiTheme {
                Scaffold(
                    topBar = {
                        TitleBar()
                    },
                    bottomBar = {
                        BottomBar()
                    },
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Column(
                        modifier = Modifier
                            .padding(it)
                            .fillMaxSize()
                            .background(Color.Black)
                    ) {
                        HomeScreen()
                    }
                }
            }
        }
    }
}
