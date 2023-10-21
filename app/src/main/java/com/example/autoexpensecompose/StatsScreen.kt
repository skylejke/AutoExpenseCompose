package com.example.autoexpensecompose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.autoexpensecompose.ui.theme.AutoExpenseComposeTheme

@Composable
fun StatsScreen() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
    ) {
        Text(text = "Stats Screen")
    }
}

@Composable
@Preview(showBackground = true)
fun StatsScreenPreview() {
    AutoExpenseComposeTheme {
       // StatsScreen()
    }
}