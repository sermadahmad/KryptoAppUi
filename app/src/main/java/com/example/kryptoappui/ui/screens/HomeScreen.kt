package com.example.kryptoappui.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TitleBar(modifier: Modifier = Modifier) {
    Column {
        Spacer(
            modifier = Modifier
                .height(40.dp)
                .fillMaxWidth()
                .background(Color.Black)
                .border(1.dp, Color.Black)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .padding(16.dp),
        ) {
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .size(70.dp)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Back",
                    tint = Color.White,
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .fillMaxSize()
                        .padding(12.dp)
                )

            }
            Spacer(modifier = Modifier.width(80.dp))
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "Swapping",
                    color = Color.White,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Surface(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
        ) {
            item { FromToSection(name = "From") }
            item { FromToSection(name = "To") }
            item { NetworkFeesSection() }
            item { BalanceCard() }
            item { SwapButton() }
            item { SwapButton() }
        }
    }
}

@Composable
fun FromToSection(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.background(Color.Black)
    ) {
        Text(
            text = name,
            color = Color.White,
            fontSize = 16.sp,
            modifier = Modifier.padding(start = 16.dp, top = 8.dp, bottom = 8.dp)

        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, top = 4.dp, bottom = 12.dp)
                .background(Color.DarkGray, CircleShape)

        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
            ) {
                IconButton(modifier = Modifier
                    .size(70.dp)
                    .padding(8.dp),
                    onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Home,
                        contentDescription = "Icon",
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.White)
                            .padding(8.dp)
                    )
                }
                Column {

                    Text(
                        text = "Ethereum",
                        color = Color.White,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 2.dp)
                    )
                    Text(
                        text = "ETH",
                        color = Color.Gray,
                        fontSize = 14.sp,
                        modifier = Modifier.padding(start = 2.dp)


                    )
                }
            }
            Text(
                text = "Estimated: 4", color = Color.White, modifier = Modifier.padding(12.dp)
            )

        }
    }
}

@Composable
fun NetworkFeesSection(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(16.dp)
    ) {
        Text(
            text = "Network Fees",
            color = Color.White,
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = "$3,40",
            color = Color.White,
        )

    }
}

@Composable
fun BalanceCard(modifier: Modifier = Modifier) {
    ElevatedCard(
        onClick = { /*TODO*/ },
        shape = RoundedCornerShape(30.dp),
        modifier = Modifier
            .background(Color.Black)
            .padding(16.dp)

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.DarkGray)
                .padding(8.dp)

        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(8.dp)
            ) {
                BalanceCardComp()
                BalanceCardComp()
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Estimated Balance",
                color = Color.White,
                modifier = Modifier.padding(start = 12.dp)
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 8.dp, bottom = 8.dp)
            ) {
                Text(
                    text = "$56,787.00",
                    color = Color.White,
                    fontSize = 35.sp,
                    modifier = Modifier.padding(4.dp)
                )
                Text(
                    text = "+5.25%",
                    color = Color.Black,
                    fontSize = 12.sp,
                    modifier = Modifier
                        .padding(4.dp)
                        .background(Color.Gray, RoundedCornerShape(25.dp))
                        .padding(4.dp)
                )
            }

        }
    }
}

@Composable
fun BalanceCardComp() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(4.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(Color.Gray)


    ) {
        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .padding(4.dp)
                .size(25.dp)

        ) {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Icon",
                tint = Color.Black,
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxSize()
                    .padding(4.dp)
            )
        }
        Text(
            text = "0xA2...4F10",
            color = Color.White,
            fontSize = 12.sp,
            modifier = Modifier.padding(4.dp),
        )
    }
}

@Composable
fun SwapButton(modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(4.dp)
    ) {
        ElevatedButton(modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp),
            colors = ButtonColors(Color.White, Color.Black, Color.Black, Color.White),
            onClick = { /*TODO*/ }) {
            Text(
                text = "Swap",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}

@Composable
fun BottomBar(modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
    ) {
        NavigationBar(
            containerColor = Color.DarkGray,
            modifier = Modifier
                .padding(4.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 8.dp,
                        topEnd = 8.dp,
                        bottomStart = 40.dp,
                        bottomEnd = 40.dp
                    )
                )

        ) {
            repeat(5) {
                NavigationBarItem(
                    selected = false,
                    onClick = { /*TODO*/ },
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.Home,
                            contentDescription = "",
                            tint = Color.White,
                            modifier = Modifier.size(30.dp)
                        )
                    }
                )
            }
        }
    }
}
