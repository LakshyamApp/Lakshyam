package com.santhi.lakshyam.onbording.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.santhi.lakshyam.MainActivity
import com.santhi.lakshyam.R

class StartupScreenAcitivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_startup_screen_acitivity)

        Handler(Looper.getMainLooper()).postDelayed({
            // This method will be executed once the timer is over
            // Start your app's main activity
            val intent = Intent(this, PaperOnBordingActivity::class.java)
            startActivity(intent)

            // Close this activity
            finish()
        }, 2000)
    }
}