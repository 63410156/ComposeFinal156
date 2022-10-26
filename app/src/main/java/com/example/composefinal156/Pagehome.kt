package com.example.composefinal156

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Pagehome(navController: NavController) {
    Column() {
        TopAppBar(title = {
            Row(
                modifier = Modifier.fillMaxWidth(),
            ) {
                Column(modifier = Modifier.padding(1.dp)) {
                    Text(
                        "Mobile Application", style = TextStyle(
                            fontSize = 25.sp,
                            fontWeight = FontWeight.W800,
                        )
                    )
                }
            }

        }, backgroundColor = Color(0xFFffffff))
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Column(modifier = Modifier
                .padding(10.dp)
                .clickable { navController.navigate("B") }) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    elevation = 8.dp,
                ) {
                    Column {

                        Column(modifier = Modifier.padding(16.dp)) {

                            Text(
                                "63410040 WATTANACHAI MANEEKHAM", style = TextStyle(
                                    fontSize = 20.sp,

                                )
                            )
                        }
                    }
                }
            }
            Column(modifier = Modifier
                .padding(10.dp)
                .clickable { navController.navigate("C") }) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    elevation = 8.dp,
                ) {
                    Column {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                "63410043 CHETHAMAS PHAICHAN",
                                style = TextStyle(
                                    fontSize = 20.sp,

                                )
                            )
                        }
                    }
                }
            }
            Column(modifier = Modifier
                .padding(10.dp)
                .clickable { navController.navigate("D") }) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    elevation = 8.dp,
                ) {
                    Column {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                "63410075 KASIPAT JANSOON",
                                style = TextStyle(
                                    fontSize = 20.sp,

                                )
                            )
                        }
                    }
                }
            }
            Column(modifier = Modifier
                .padding(10.dp)
                .clickable { navController.navigate("E") }) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    elevation = 8.dp,
                ) {
                    Column {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                "63410077 SUTANAI WANMAHACHAI",
                                style = TextStyle(
                                    fontSize = 20.sp,

                                )
                            )
                        }
                    }
                }
            }
            Column(modifier = Modifier
                .padding(10.dp)
                .clickable { navController.navigate("F") }) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    elevation = 8.dp,
                ) {
                    Column {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                "63410154 PUNYARIT KLAPHACHON",
                                style = TextStyle(
                                    fontSize = 20.sp,

                                )
                            )
                        }
                    }
                }
            }
            Column(modifier = Modifier
                .padding(10.dp)
                .clickable { navController.navigate("G") }) {
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    elevation = 8.dp,
                ) {
                    Column {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                "63410156 RATCHAPHUMPHOUG PHONTHAI",
                                style = TextStyle(
                                    fontSize = 20.sp,
                                )
                            )
                        }
                    }
                }
            }
        }
    }
}