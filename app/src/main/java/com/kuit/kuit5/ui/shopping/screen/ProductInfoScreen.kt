package com.kuit.kuit5.ui.shopping.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.model.ProductInfoData
import com.kuit.kuit5.navigation.Route
import com.kuit.kuit5.ui.shopping.component.ProductInfoItem
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import com.kuit.kuit5.util.toDecimalFormat

@Composable
fun ProductInfoScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    onNavigateToCreateAccount: () -> Unit
    ) {
    Column(
        modifier = modifier.fillMaxSize()

    ){
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            Icon(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(
                        top = 70.dp,
                    ),
                painter = painterResource(id = R.drawable.img_shopping_kb),
                contentDescription = "KB",
                tint = Color.Unspecified
            )
            ProductInfoItem(
                product = ProductInfoData(
                    topic = "가입 연령",
                    content = "19~34세"
                )
            )
            ProductInfoItem(
                product = ProductInfoData(
                    topic = "소득 수준",
                    content = "연 " + 6000.toDecimalFormat() + "만원 이하"
                )
            )
            ProductInfoItem(
                product = ProductInfoData(
                    topic = "월 납입 금액",
                    content = "40만원 ~ 최대 70만원"
                )
            )
            ProductInfoItem(
                product = ProductInfoData(
                    topic = "정부 지원금",
                    content = "납입액의 3~6%"
                )
            )
            Button(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(top = 120.dp),
                colors = ButtonColors(
                    containerColor = colors.gray300,
                    contentColor = Color.White,
                    disabledContentColor = colors.gray300,
                    disabledContainerColor = Color.White
                ),
                onClick = {
                    onNavigateToCreateAccount()
                }
            ){
                Text(text = "가입하기",
                    style = typography.body_02_R_12)
            }
        }


    }


}