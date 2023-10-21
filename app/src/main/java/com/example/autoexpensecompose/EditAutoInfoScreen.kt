package com.example.autoexpensecompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.autoexpensecompose.ui.theme.AutoExpenseComposeTheme
import com.example.autoexpensecompose.ui.theme.LightSkyBlue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditAutoInfoScreen(navController: NavController) {

    var brand by remember { mutableStateOf("") }
    var model by remember { mutableStateOf("") }
    var mileage by remember { mutableStateOf("") }
    var power by remember { mutableStateOf("") }
    var fuelType by remember { mutableStateOf("") }
    var year by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 8.dp
            ),
            colors = CardDefaults.cardColors(containerColor = LightSkyBlue)
        ) {
            TextField(
                value = brand,
                onValueChange = { brand = it },
                Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                label = { Text(text = "Марка", color = Color.Black) },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                colors = TextFieldDefaults.textFieldColors(containerColor = LightSkyBlue),
                maxLines = 1
            )

            Spacer(modifier = Modifier.height(5.dp))

            TextField(
                value = model,
                onValueChange = { model = it },
                Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                label = { Text(text = "Модель", color = Color.Black) },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                colors = TextFieldDefaults.textFieldColors(containerColor = LightSkyBlue),
                maxLines = 1
            )

            Spacer(modifier = Modifier.height(5.dp))

            TextField(
                value = mileage,
                onValueChange = { mileage = it },
                Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                label = { Text(text = "Пробег", color = Color.Black) },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                colors = TextFieldDefaults.textFieldColors(containerColor = LightSkyBlue),
                maxLines = 1
            )

            Spacer(modifier = Modifier.height(5.dp))

            TextField(
                value = power,
                onValueChange = { power = it },
                Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                label = { Text(text = "Мощность", color = Color.Black) },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                colors = TextFieldDefaults.textFieldColors(containerColor = LightSkyBlue),
                maxLines = 1
            )

            Spacer(modifier = Modifier.height(5.dp))

            TextField(
                value = fuelType,
                onValueChange = { fuelType = it },
                Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                label = { Text(text = "Тип топлива", color = Color.Black) },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                colors = TextFieldDefaults.textFieldColors(containerColor = LightSkyBlue),
                maxLines = 1
            )

            Spacer(modifier = Modifier.height(5.dp))

            TextField(
                value = year,
                onValueChange = { year = it },
                Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                label = { Text(text = "Год выпуска", color = Color.Black) },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                colors = TextFieldDefaults.textFieldColors(containerColor = LightSkyBlue),
                maxLines = 1
            )

        }

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            content = {
                Button(
                    onClick = {
                        navController.navigate(Screen.AutoInfoScreen.route)
                    },
                    modifier = Modifier.padding(top = 20.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                ) {
                    Text(text = "Отменить", color = MaterialTheme.colorScheme.onPrimary)
                }

                Button(
                    onClick = {
                        navController.navigate(Screen.AutoInfoScreen.route)
                    },
                    modifier = Modifier.padding(top = 20.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Green),
                ) {
                    Text(text = "Сохранить", color = MaterialTheme.colorScheme.onPrimary)
                }
            }
        )
    }
}


@Composable
@Preview(showBackground = true)
fun EditAutoInfoScreenPreview() {
    AutoExpenseComposeTheme {
        //EditAutoInfoScreen()
    }
}