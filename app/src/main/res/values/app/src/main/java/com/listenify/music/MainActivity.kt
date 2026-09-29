package com.listenify.music

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ListenifyApp()
        }
    }
}

@Composable
fun ListenifyApp() {

    var selectedTab by remember { mutableStateOf(0) }

    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFF070709)
        ) {

            Column(
                modifier = Modifier.fillMaxSize()
            ) {

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                        .padding(20.dp)
                ) {

                    Text(
                        text = "LISTENIFY",
                        color = Color.White,
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "Your music. Your vibe.",
                        color = Color(0xFF9B9BA3),
                        fontSize = 14.sp
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    Text(
                        text = "Welcome to Listenify 🎧",
                        color = Color.White,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(20.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFF15151A)
                        )
                    ) {

                        Column(
                            modifier = Modifier.padding(20.dp)
                        ) {

                            Text(
                                text = "Discover Music",
                                color = Color.White,
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Spacer(modifier = Modifier.height(8.dp))

                            Text(
                                text = "Search and stream your favorite music online.",
                                color = Color(0xFFAAAAAF),
                                fontSize = 14.sp
                            )

                            Spacer(modifier = Modifier.height(18.dp))

                            Button(
                                onClick = {},
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color(0xFF5865F2)
                                ),
                                shape = RoundedCornerShape(14.dp)
                            ) {
                                Text("Start Listening")
                            }
                        }
                    }
                }

                NavigationBar(
                    containerColor = Color(0xFF0D0D10)
                ) {

                    NavigationBarItem(
                        selected = selectedTab == 0,
                        onClick = { selectedTab = 0 },
                        icon = { Text("🏠") },
                        label = { Text("Home") }
                    )

                    NavigationBarItem(
                        selected = selectedTab == 1,
                        onClick = { selectedTab = 1 },
                        icon = { Text("🔍") },
                        label = { Text("Search") }
                    )

                    NavigationBarItem(
                        selected = selectedTab == 2,
                        onClick = { selectedTab = 2 },
                        icon = { Text("❤️") },
                        label = { Text("Liked") }
                    )

                    NavigationBarItem(
                        selected = selectedTab == 3,
                        onClick = { selectedTab = 3 },
                        icon = { Text("📚") },
                        label = { Text("Library") }
                    )
                }
            }
        }
    }
}
