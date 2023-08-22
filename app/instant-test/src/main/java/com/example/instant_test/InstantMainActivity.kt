package com.example.instant_test

//import android.R
import com.example.instant_test.R
import android.content.Intent
import android.nfc.NdefMessage
import android.nfc.NfcAdapter
import android.os.Bundle
import android.os.Parcelable
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.instant_test.ui.theme.InstanttestTheme
import com.google.android.gms.common.wrappers.InstantApps.isInstantApp
import android.app.Activity
import android.view.View
import android.widget.Button

class InstantMainActivity : ComponentActivity() {

    private var nfcAdapter: NfcAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize NFC adapter
        nfcAdapter = NfcAdapter.getDefaultAdapter(this)

        val startNfcButton = findViewById<Button>(R.id.startNfcButton)
        startNfcButton.setOnClickListener {
            if (nfcAdapter != null && nfcAdapter!!.isEnabled) {
                // Start NFC reading logic here
                // You can launch an NFC reading activity or handle reading directly
            } else {
                Toast.makeText(this, "NFC not available", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
