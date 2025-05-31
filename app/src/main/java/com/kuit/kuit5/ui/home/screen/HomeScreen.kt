package com.kuit.kuit5.ui.home.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kuit.kuit5.Components.LidData
import com.kuit.kuit5.R
import com.kuit.kuit5.model.AccountData
import com.kuit.kuit5.model.ChoiceData
import com.kuit.kuit5.model.UniversalLidData
import com.kuit.kuit5.ui.asset.component.HomeAccount
import com.kuit.kuit5.ui.asset.component.HomeChoice
import com.kuit.kuit5.ui.theme.BankSaladTheme.colors
import com.kuit.kuit5.ui.theme.BankSaladTheme.typography
import com.kuit.kuit5.util.toDecimalFormat


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    var scrollState = rememberScrollState()
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = colors.gray200)
    ) {
        TopAppBar(
            modifier = modifier
                .fillMaxWidth(),
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = colors.gray200
            ),
            title = {
                Icon(
                    modifier = modifier
                        .padding(
                            // start = 20.dp
                            top = 20.dp,
                            bottom = 24.dp
                        )
                        .size(24.dp),
                    painter = painterResource(id = R.drawable.img_home_banksalad),
                    contentDescription = "BankSalad",
                    tint = Color.Unspecified
                )
            },
            actions = {
              Row(
                  modifier = modifier
                      .padding(
                          end =  20.dp,
                          top = 20.dp,
                          bottom = 24.dp),
                  horizontalArrangement = Arrangement.spacedBy(16.dp)
              ){
                  Icon(
                      modifier = modifier
                          .size(24.dp),
                      painter = painterResource(id = R.drawable.ic_assets_bell),
                      contentDescription = "bell",
                      tint = colors.gray400
                  )
                  Icon(
                      modifier = modifier
                          .size(24.dp),
                      painter = painterResource(id = R.drawable.ic_assets_stack),
                      contentDescription = "stack",
                      tint = colors.gray400
                  )
              }
            }
        )
        Column(
            modifier = modifier
                .fillMaxWidth()
                .verticalScroll(state = scrollState)
        ){
            Card(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
                    .height(60.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
            content = {
                Row(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(){
                        Text(
                            modifier = modifier
                                .padding(top = 12.dp),
                            text = "3월에만 받을 수 있는",
                            style = typography.caption_01_R_10,
                            color = colors.gray500
                        )
                        Row(
                            modifier = modifier
                                .padding(top = 10.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "최대 17만원 용돈받기",
                                style = typography.head_04_SB_14
                            )
                            Icon(
                                painter = painterResource(id = R.drawable.ic__assets_pointer),
                                contentDescription = "pointer",
                                tint = Color.Black
                            )
                        }
                    }
                    Box(
                    ){
                        Icon(
                            modifier = modifier
                                .size(40.dp),
                            painter = painterResource(id= R.drawable.img_home_bills),
                            contentDescription = "bills",
                            tint = Color.Unspecified
                        )
                        Box(){
                            Icon(
                                modifier = modifier
                                    .width(32.dp)
                                    .padding(
                                        end = 10.dp,
                                        top = 32.dp
                                    ),
                                painter = painterResource(id = R.drawable.img_home_rectangle),
                                contentDescription = "rectangle",
                                tint = colors.gray400
                            )
                            Text(
                                modifier = modifier
                                    .padding(
                                        horizontal = 6.dp,
                                        vertical = 4.dp),
                                text = "1 / 5",
                                style = typography.caption_01_R_10,
                                color = Color.White
                            )
                        }
                    }
                }
            }
            )
            Row(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(
                        top = 24.dp,
                        bottom = 24.dp,
                        start = 29.dp,
                        end = 23.dp
                    ),
            ){
                HomeChoice(
                    choice = ChoiceData(
                        choice_icon = R.drawable.img_home_allowance,
                        choice_name = "용돈벌이"
                    )
                )
                HomeChoice(
                    modifier = modifier
                        .padding(
                            start = 22.dp,
                            end = 22.dp
                        ),
                    choice = ChoiceData(
                        choice_icon = R.drawable.img_home_heart,
                        choice_name = "보험리모델링"
                    )
                )
                HomeChoice(
                    modifier = modifier
                        .padding(
                            end = 28.dp
                        ),
                    choice = ChoiceData(
                        choice_icon = R.drawable.img_home_money,
                        choice_name = "대출찾기"
                    )
                )
                HomeChoice(
                    choice = ChoiceData(
                        choice_icon = R.drawable.img_home_card,
                        choice_name = "카트이벤트"
                    )
                )
            }
            // 11111111111111111111111111111111111111
            Box(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(
                        start = 20.dp,
                        end = 20.dp
                    )
                    .height(258.dp)
                    .background(color = Color.White)
            ) {
                Row(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(
                            start = 20.dp,
                            end = 20.dp,
                            top = 14.dp
                        ),
                ) {
                    LidData(
                        lid = UniversalLidData(
                            lid_name = "입출금 계좌",
                            lid_money = 234567.toDecimalFormat() + "원",
                            lid_button = "송금"
                        )
                    )
                }
                Text(
                    modifier = modifier
                        .align(Alignment.TopEnd)
                        .padding(
                            end = 20.dp,
                            top = 86.dp
                        ),
                    text = "어제보다",
                    style = typography.body_02_R_12,
                    color = colors.gray400
                )
                Row(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(
                            top = 120.dp,
                            start = 20.dp,
                            end = 20.dp
                        )
                ) {
                    HomeAccount(
                        account = AccountData(
                            account_function = "입출금통장",
                            account_bank = R.drawable.img_assets_kakaobank,
                            account_money = 234567.toDecimalFormat() + "원",
                            accout_updown = R.drawable.img_home_polygon,
                            account_storage = 3300.toDecimalFormat() + "원"
                        )
                    )
                }

                Card(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(
                            start = 20.dp,
                            end = 20.dp,
                            top = 178.dp
                        )
                        .height(56.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = colors.apricot
                    ),
                    content = {
                        Row(
                            modifier = modifier
                                .fillMaxWidth()
                                .padding(
                                    horizontal = 12.dp,
                                    vertical = 14.dp
                                ),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ){
                                Icon(
                                    modifier = modifier
                                        .padding(end = 8.dp)
                                        .size(28.dp),
                                    painter = painterResource(id = R.drawable.img_home_cat),
                                    contentDescription = "cat",
                                    tint = Color.Unspecified
                                )
                                Text(
                                    text = "목표를 설정하고 종잣돈을 모아보세요",
                                    style = typography.body_02_R_12
                                )
                            }
                            Icon(
                                modifier = modifier
                                    .size(12.dp),
                                painter = painterResource(id = R.drawable.ic__assets_pointer),
                                contentDescription = "pointer",
                                tint = colors.gray400
                            )
                        }
                    }
                )
            }
            // 22222222222222222222222222222222222222222
            Box(
                modifier = modifier
                    .padding(
                        start = 20.dp,
                        end = 20.dp,
                        top = 16.dp,
                        bottom = 16.dp
                    )
                    .height(306.dp)
                    .width(320.dp)
                    .background(color = Color.White)
            ) {
                Row(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(
                            start = 20.dp,
                            end = 20.dp,
                            top = 14.dp
                        ),
                ) {
                    LidData(
                        lid = UniversalLidData(
                            lid_name = "입출금 계좌",
                            lid_money = 234567.toDecimalFormat() + "원",
                            lid_button = "송금"
                        )
                    )
                }
                Text(
                    modifier = modifier
                        .padding(
                            start = 20.dp,
                            top = 80.dp
                        ),
                    text =
                    buildAnnotatedString {
                        withStyle(style = SpanStyle(fontSize = 12.sp)){
                            append("지난 방문일보다 ")
                        }
                        withStyle(style = SpanStyle(color = colors.green, fontSize = 12.sp)){
                            append("4500원")
                        }
                        withStyle(style = SpanStyle(fontSize = 12.sp)){
                            append(" 줄었어요")
                        }
                    }
                )
                Column(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(
                            top = 120.dp,
                            start = 20.dp,
                            end = 20.dp
                        )
                ) {
                    HomeAccount(
                        account = AccountData(
                            account_function = "계좌.현금",
                            account_bank = R.drawable.img_assets_kakaobank,
                            account_money = 234576.toDecimalFormat() + "원",
                            accout_updown = R.drawable.img_home_polygon,
                            account_storage = 4500.toDecimalFormat() + "원"
                        )
                    )
                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(24.dp)
                    )
                    HomeAccount(
                        account = AccountData(
                            account_function = "예적금",
                            account_bank = R.drawable.img_assets_kakaobank,
                            account_money = 1000000.toDecimalFormat() + "원",
                            accout_updown = R.drawable.img_home_polygon,
                            account_storage = 10000.toDecimalFormat() + "원"
                        )
                    )
                }

                Card(
                    modifier = modifier
                        .padding(
                            start = 20.dp,
                            top = 242.dp
                        )
                        .width(280.dp)
                        .height(40.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = colors.gray200
                    ),
                    content = {
                        Row(
                            modifier = modifier
                                .fillMaxWidth()
                                .padding(
                                    horizontal = 12.dp,
                                    vertical = 14.dp
                                ),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ){
                                Text(
                                    text = "목표를 설정하고 종잣돈을 모아보세요",
                                    style = typography.body_02_R_12
                                )
                            }
                            Icon(
                                modifier = modifier
                                    .size(12.dp),
                                painter = painterResource(id = R.drawable.ic__assets_pointer),
                                contentDescription = "pointer",
                                tint = colors.gray400
                            )
                        }
                    }
                )
            }
            // 333333333333333333333333333333333333333
            Box(
                modifier = modifier
                    .padding(
                        start = 20.dp,
                        end = 20.dp,
                        bottom = 100.dp
                    )
                    .height(306.dp)
                    .width(320.dp)
                    .background(color = Color.White)
            ) {
                Row(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(
                            start = 20.dp,
                            end = 20.dp,
                            top = 14.dp
                        ),
                ) {
                    LidData(
                        lid = UniversalLidData(
                            lid_name = "입출금 계좌",
                            lid_money = "234567원",
                            lid_button = "송금"
                        )
                    )
                }
                Text(
                    modifier = modifier
                        .padding(
                            start = 20.dp,
                            top = 80.dp
                        ),
                    text =
                        buildAnnotatedString {
                            withStyle(style = SpanStyle(fontSize = 12.sp)){
                                append("지난 방문일보다 ")
                            }
                            withStyle(style = SpanStyle(color = colors.green, fontSize = 12.sp)){
                                append("4500원")
                            }
                            withStyle(style = SpanStyle(fontSize = 12.sp)){
                                append(" 줄었어요")
                            }
                        }
                )
                Column(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(
                            top = 120.dp,
                            start = 20.dp,
                            end = 20.dp
                        )
                ) {
                    HomeAccount(
                        account = AccountData(
                            account_function = "오늘 지출",
                            account_bank = R.drawable.img_home_won,
                            account_money = 21500.toDecimalFormat() + "원",
                            accout_updown = R.drawable.img_home_polygon,
                            account_storage = ""
                        )
                    )
                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(24.dp)
                    )
                    HomeAccount(
                        account = AccountData(
                            account_function = "어제 지출",
                            account_bank = R.drawable.img_home_won,
                            account_money = 3500.toDecimalFormat() + "원",
                            accout_updown = R.drawable.img_home_polygon,
                            account_storage = ""
                        )
                    )
                }

                Card(
                    modifier = modifier
                        .padding(
                            start = 20.dp,
                            top = 242.dp
                        )
                        .width(280.dp)
                        .height(40.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = colors.gray200
                    ),
                    content = {
                        Row(
                            modifier = modifier
                                .fillMaxWidth()
                                .padding(
                                    horizontal = 12.dp,
                                    vertical = 14.dp
                                ),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ){
                                Text(
                                    text = "3월 카드 지출",
                                    style = typography.body_02_R_12
                                )
                            }
                            Icon(
                                modifier = modifier
                                    .size(12.dp),
                                painter = painterResource(id = R.drawable.ic__assets_pointer),
                                contentDescription = "pointer",
                                tint = colors.gray400
                            )
                        }
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview(){
    HomeScreen()
}