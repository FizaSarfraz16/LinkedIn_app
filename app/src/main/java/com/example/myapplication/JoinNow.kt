package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class JoinNowActivity : AppCompatActivity() {

    private lateinit var signInButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join_now)

//        signInButton = findViewById(R.id.btn_sign_in)
//
//        signInButton.setOnClickListener {
//            showWelcomeMessage()
//        }
    }

    private fun showWelcomeMessage() {
        Toast.makeText(this, "Welcome!", Toast.LENGTH_LONG).show()
    }
}

// The JoinNow class can be defined separately as shown below
class JoinNow {
    // Define properties and methods here if needed
    var name: String = ""
    var email: String = ""

    // Example method
    fun displayInfo() {
        println("Name: $name, Email: $email")
    }
}
