package com.example.myapplication


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Delay for 3 seconds before transitioning
        Handler(Looper.getMainLooper()).postDelayed(
            {
                // Uncomment and add SignIn Activity later when ready
                 val intent = Intent(this, SignIn::class.java)
                 startActivity(intent)
                 finish()
            }, 2000)  // 3-second delay for splash effect
    }
}
