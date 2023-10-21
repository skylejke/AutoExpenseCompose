package com.example.autoexpensecompose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.work.Data
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import com.example.autoexpensecompose.ui.theme.AutoExpenseComposeTheme


@Composable
fun FuelScreen() {
    val context = LocalContext.current
    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
        Button(onClick = {
            val delaySeconds = 10
            val inputData = Data.Builder().putInt("delaySeconds", delaySeconds).build()
            val workRequest = OneTimeWorkRequest.Builder(MyWorkManager::class.java)
                .setInputData(inputData)
                .build()

            WorkManager.getInstance(context).enqueue(workRequest)

        }) {
            Text(text = "Установить таймер")
        }
//        Text(text = "Fuel Screen")
    }
}

@Composable
@Preview(showBackground = true)
fun FuelScreenPreview() {
    AutoExpenseComposeTheme {
        FuelScreen()
    }
}