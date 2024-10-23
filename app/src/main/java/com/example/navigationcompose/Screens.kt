package com.example.navigationcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Screen_1(onClick : () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "Screen_1",
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            onClick()
        }
        ) {
            Text(text = "Screen_2")
        }
    }
}

@Composable
fun Screen_2(onClick : () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "Screen_2",
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            onClick()
        }
        ) {
            Text(text = "Screen_3")
        }
    }
}

@Composable
fun Screen_3(onClick : () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = "Screen_3",
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            onClick()
        }
        ) {
            Text(text = "Screen_1")
        }
    }
}