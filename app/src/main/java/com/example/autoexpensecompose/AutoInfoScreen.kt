package com.example.autoexpensecompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.autoexpensecompose.ui.theme.AutoExpenseComposeTheme
import com.example.autoexpensecompose.ui.theme.OceanBlue

@Composable
fun AutoInfoScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Ваш автомобиль",
            fontSize = 25.sp,
            color = Color.Black,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(bottom = 20.dp)
        )

        InfoRow("Название", "asd")
        InfoRow("Пробег", "asd")
        InfoRow("Мощность", "asd")
        InfoRow("Вид топлива", "asd")
        InfoRow("Год выпуска", "asd")

        Spacer(modifier = Modifier.height(40.dp))

        Button(
            onClick = {
                navController.navigate(Screen.EditAutoInfoScreen.route)
            },
            modifier = Modifier
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = OceanBlue)
        ) {
            Text(
                text = "Редактировать",
                color = Color.White
            )
        }
    }
}

@Composable
fun InfoRow(title: String, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp) // Пространство между элементами
    ) {
        Text(
            text = title,
            color = Color.Black,
            fontSize = 15.sp,
            modifier = Modifier.weight(1f)
        )
        Text(
            text = value,
            color = Color.Black,
            fontSize = 15.sp,
            modifier = Modifier.align(Alignment.CenterVertically) // Используйте CenterVertically для выравнивания по вертикали
        )
    }
}

@Composable
@Preview(showBackground = true)
fun AutoInfoScreenPreview() {
    AutoExpenseComposeTheme {
        //AutoInfoScreen()
    }
}
