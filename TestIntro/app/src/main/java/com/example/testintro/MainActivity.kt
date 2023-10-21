package com.example.testintro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.testintro.ui.theme.TestIntroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(androidx.core.R.layout.custom_dialog)

        val tax = Tax()
        val netIncome = tax.calculateIncome(100.0,0.1)
        val netTax = tax.calculateTax(100.0, 0.1)

        println(netIncome)
        println(netTax)
    }
}
