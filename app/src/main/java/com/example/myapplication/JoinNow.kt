package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class JoinNowActivity : AppCompatActivity() {

    private lateinit var joinNowButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join_now)

        joinNowButton = findViewById(R.id.btn_join_now)

        joinNowButton.setOnClickListener {
            showWelcomeMessage()
        }
    }

    // Method to display a toast message
    private fun showWelcomeMessage() {
        Toast.makeText(this, "Welcome!", Toast.LENGTH_LONG).show()
    }
}


class JoinNow {
    var name: String = ""
    var email: String = ""

    // Example method
    fun displayInfo() {
        println("Name: $name, Email: $email")
    }
}
