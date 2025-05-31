package com.kuit.kuit5.ui.shopping.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.model.ProductInfoData
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun ProductInfoItem (
    modifier: Modifier = Modifier,
     product: ProductInfoData
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Text(
            modifier = modifier
                .padding(top = 30.dp,
                    bottom = 10.dp),
            text = product.topic,
            style = typography.head_03_R_16,
        )
        Text(
            text = product.content,
            style = typography.head_02_B_20
        )
    }


}