package com.kuit.kuit5.ui.shopping.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.shopping.viewmodel.ShoppingViewModel
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import com.kuit.kuit5.ui.theme.defaultBankSaladColors
import kotlin.reflect.typeOf

@Composable
fun ShoppingScreen(
    modifier: Modifier = Modifier,
    viewModel: ShoppingViewModel,
    onNavigateToProductInfo: () -> Unit
) {
    Column(

    ){
        Card(
            modifier = modifier
                .fillMaxWidth()
                .padding(
                    start = 20.dp,
                    end = 20.dp,
                    top = 70.dp
                ),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 4.dp
            ),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
           )
        ) {
            Column(
                modifier = modifier
                    .fillMaxWidth()
            ) {
                Icon(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp,
                            end = 20.dp,
                            top = 27.dp,
                            bottom = 25.dp
                        ),
                    painter = painterResource(id = R.drawable.img_shopping_kb),
                    contentDescription = "KB",
                    tint = Color.Unspecified
                )
                Text(
                    modifier = modifier
                        .padding(start = 20.dp),
                    text = "KB 청년도약계좌",
                    style = typography.head_02_B_20,
                    color = Color.Black
                )
                Card(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp, vertical = 20.dp)
                        .height(40.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = colors.gray300
                    ),
                ){
                    Row(
                        modifier = modifier
                            .fillMaxSize(),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "정보조회",
                            style = typography.body_02_R_12,
                        )
                    }
                }
            }
        }
        Button(
            modifier = modifier
                .fillMaxWidth()
                .padding(top = 250.dp,
                    start = 20.dp,
                    end = 20.dp),
            colors = ButtonColors(
                containerColor = colors.gray300,
                contentColor = Color.White,
                disabledContentColor = colors.gray300,
                disabledContainerColor = Color.White
            ),
            onClick = {
                onNavigateToProductInfo()
            }
        ){
            Text(text = "가입하기",
                style = typography.body_02_R_12)
        }
    }
}