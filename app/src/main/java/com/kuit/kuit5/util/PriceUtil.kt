package com.kuit.kuit5.util

import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color
import java.text.DecimalFormat

fun Int.toDecimalFormat(): String {
    val decimalFormat = DecimalFormat("#,###")
    return decimalFormat.format(this)
}

