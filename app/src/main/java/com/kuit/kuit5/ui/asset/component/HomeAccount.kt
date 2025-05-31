package com.kuit.kuit5.ui.asset.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kuit.kuit5.model.AccountData
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.kuit.kuit5.R
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography

@Composable
fun HomeAccount(
    modifier: Modifier = Modifier,
    account: AccountData) {
    Row(
        modifier = modifier
            .width(320.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ){
            Icon(
                modifier = modifier
                    .size(30.dp),
                painter = painterResource(id = account.account_bank),
                contentDescription = "bank",
                tint = Color.Unspecified
            )
            Column(

            ){
                Text(
                    text = account.account_function,
                    style = typography.body_01_M_14,
                    color = colors.gray400
                )
                Spacer(
                    modifier = modifier
                        .height(8.dp)
                )
                Text(
                    text = account.account_money,
                    style = typography.body_01_M_14,
                    color = Color. Black
                )
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Icon(
                modifier = modifier
                    .size(10.dp, 6.dp),
                painter = painterResource(id = account.accout_updown),
                contentDescription = "down",
                tint = Color.Blue
            )
            Text(
                text = account.account_storage,
                style = typography.body_01_M_14,
                color = Color.Blue
            )
            Icon(
                modifier = modifier
                    .size(14.dp, 14.dp),
                painter = painterResource(id = R.drawable.ic__assets_pointer),
                contentDescription = "pointer",
                tint = colors.gray500
            )
        }

    }
}