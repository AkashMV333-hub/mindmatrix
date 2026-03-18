package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardUI()
        }
    }
}

@Composable
fun BusinessCardUI() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Akash M.V",
            style = MaterialTheme.typography.headlineMedium
        )

        Text(
            text = "Android Developer",
            style = MaterialTheme.typography.bodyLarge
        )

        Spacer(modifier = Modifier.height(20.dp))

        ContactItem("📞", "+91 9876543210")
        ContactItem("📧", "akash@email.com")
        ContactItem("🌐", "www.akashdev.com")
    }
}

@Composable
fun ContactItem(icon: String, info: String) {
    Row(
        modifier = Modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = icon)
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = info)
    }
}