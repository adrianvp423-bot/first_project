package com.sena.first_project.ui.composable

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun Con_text(text: String) {
    Text(
        text = text,
        color = Color.White,
        fontSize = 16.sp
    )
}