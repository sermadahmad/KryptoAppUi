package com.example.kryptoappui.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Back",
                    tint = Color.White,
                    modifier = Modifier
                        .background(Color.DarkGray, CircleShape)
                        .size(50.dp)
                        .padding(10.dp)
                )
            }
            Spacer(modifier = Modifier.width(110.dp))
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
fun FromToSection(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.background(Color.Black)
    ) {
        Text(
            text = name,
            color = Color.White,
            fontSize = 12.sp,
            modifier = Modifier.padding(start = 16.dp, top = 8.dp)

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
                    .padding(8.dp)
                    .background(Color.White, CircleShape),
                    onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Home, contentDescription = "Icon"
                    )
                }
                Column {

                    Text(
                        text = "Ethereum", color = Color.White, modifier = Modifier.padding(2.dp)
                    )
                    Text(
                        text = "ETH",
                        color = Color.Gray,
                        fontSize = 12.sp,
                        modifier = Modifier.padding(2.dp)


                    )
                }
            }
            Text(
                text = "Estimated: 4", color = Color.White, modifier = Modifier.padding(12.dp)
            )

        }
    }
}

@Preview(showBackground = true)
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
    ElevatedCard(onClick = { /*TODO*/ }) {
        Column {
            Row {
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
                            .padding(8.dp)
                            .background(Color.White, CircleShape),
                            onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Default.Home, contentDescription = "Icon"
                            )
                        }
                        Column {

                            Text(
                                text = "Ethereum", color = Color.White, modifier = Modifier.padding(2.dp)
                            )
                            Text(
                                text = "ETH",
                                color = Color.Gray,
                                fontSize = 12.sp,
                                modifier = Modifier.padding(2.dp)


                            )
                        }
                    }
                    Text(
                        text = "Estimated: 4", color = Color.White, modifier = Modifier.padding(12.dp)
                    )

                }
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
                            .padding(8.dp)
                            .background(Color.White, CircleShape),
                            onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Default.Home, contentDescription = "Icon"
                            )
                        }
                        Column {

                            Text(
                                text = "Ethereum", color = Color.White, modifier = Modifier.padding(2.dp)
                            )
                            Text(
                                text = "ETH",
                                color = Color.Gray,
                                fontSize = 12.sp,
                                modifier = Modifier.padding(2.dp)


                            )
                        }
                    }
                    Text(
                        text = "Estimated: 4", color = Color.White, modifier = Modifier.padding(12.dp)
                    )

                }
            }
        }
    }
}