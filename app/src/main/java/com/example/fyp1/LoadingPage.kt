package com.example.fyp1
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

    class LoadingPage : AppCompatActivity() {
        private val SPLASH_TIME_OUT: Long = 3000 // 3 seconds

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_login)

            // Delay for splash screen
            Handler().postDelayed({
                // Start your MainActivity after the splash timeout.
                // Replace MainActivity::class.java with your main activity.
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }, SPLASH_TIME_OUT)
        }
    }

