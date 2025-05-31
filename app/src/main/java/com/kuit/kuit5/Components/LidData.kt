package com.kuit.kuit5.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.model.UniversalLidData
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun LidData(
    modifier: Modifier = Modifier,
    lid: UniversalLidData) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Column(

        ) {
            Text(
                text = lid.lid_name,
                style = typography.head_03_R_16
            )
            Spacer(
                modifier = modifier
                    .height(10.dp)
            )
            Text(
                text = lid.lid_money,
                style = typography.head_02_B_20
            )
        }
        Button(
            modifier = modifier
                .width(58.dp)
                .height(38.dp),
            contentPadding = PaddingValues(0.dp),
            shape = RoundedCornerShape(6.dp),
            onClick = {

            },
            colors = ButtonDefaults.buttonColors(
                containerColor = colors.gray200,
                contentColor = Color.Black
            )
        ){
            Text(
                text = lid.lid_button,
                style = typography.head_04_SB_14
            )
        }
    }
}