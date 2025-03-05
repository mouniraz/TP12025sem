package com.example.tp12025sem2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tp12025sem2.ui.theme.TP12025sem2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TP12025sem2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    ProfileCard(innerPadding)
                }
            }
        }
    }
}



@Composable
fun ProfileCard(padding: PaddingValues) {
    Box(
        modifier = Modifier
            .padding(padding)
            .fillMaxWidth()
            .background(Color(0xFFEEEEEE),
                shape = RoundedCornerShape(16.dp))
            .shadow(4.dp) // Shadow effect
    )

    {
        Column(
            modifier = Modifier
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Image inside Box
            Box(
                modifier = Modifier
                    .size(120.dp)                                        .background(Color.Gray, shape = CircleShape),
                contentAlignment = Alignment.Center) {
                Image(
                    painter = painterResource(id = R.drawable.img_1), // Replace with your image
                    contentDescription = "Profile Image",
                    modifier = Modifier
                        .size(100.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Text
            Text(
                text = "John Doe",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )

            Text(
                text = "Android Developer",
                fontSize = 16.sp,
                color = Color.Gray
            )
        }
    }
}
@Composable
fun CounterApp(padding: PaddingValues) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Counter: 0", style = MaterialTheme.typography.headlineLarge)
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { }) {
            Text(text = "Increment")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TP12025sem2Theme {
        ProfileCard(padding = PaddingValues(20.dp))
    }
}