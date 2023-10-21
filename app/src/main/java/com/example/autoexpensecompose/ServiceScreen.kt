package com.example.autoexpensecompose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.autoexpensecompose.ui.theme.AutoExpenseComposeTheme

@Composable
fun ServiceScreen() {
    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
        Text(text = "Service Screen")
    }
}

@Composable
@Preview(showBackground = true)
fun ServiceScreenPreview() {
    AutoExpenseComposeTheme {
        ServiceScreen()
    }
}