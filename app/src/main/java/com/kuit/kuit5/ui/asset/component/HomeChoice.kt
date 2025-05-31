package com.kuit.kuit5.ui.asset.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.ChoiceData
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun HomeChoice(
    modifier: Modifier = Modifier,
    choice: ChoiceData) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Icon(
            modifier = modifier
                .size(36.dp),
            painter = painterResource(id = choice.choice_icon),
            contentDescription = "choice",
            tint = Color.Unspecified
        )
        Text(
            modifier = modifier
                .padding(top = 10.dp),
            text = choice.choice_name,
            style = typography.body_01_M_14,
            color = colors.gray500
        )
    }
}

@Preview
@Composable
private fun HomeChoicePreview(){
    val choice = ChoiceData(
        choice_icon = R.drawable.img_home_allowance,
        choice_name = "용돈벌이"
    )
}