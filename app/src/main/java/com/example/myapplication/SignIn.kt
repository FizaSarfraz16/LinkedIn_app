package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignIn : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        // Initialize views
        val emailPhoneInput = findViewById<EditText>(R.id.EtEmail) // Change ID to EtEmail
        val passwordInput = findViewById<EditText>(R.id.EtPass) // Change ID to EtPass
//        val signInButton = findViewById<Button>(R.id.btn_continue) // Change ID to btn_continue
//
//        // Handle Sign In button click
//        signInButton.setOnClickListener {
//            val emailPhone = emailPhoneInput.text.toString()
//            val password = passwordInput.text.toString()
//
//            if (emailPhone.isNotEmpty() && password.isNotEmpty()) {
//                // Proceed with login (You can add your logic here)
//                Toast.makeText(this, "Sign In successful!", Toast.LENGTH_SHORT).show()
//
//                // For example, navigate to another activity
//                val intent = Intent(this, MainActivity::class.java)
//                startActivity(intent)
//                finish() // Optional: Close the SignIn activity
//            } else {
//                // Show error message
//                Toast.makeText(this, "Please enter all details", Toast.LENGTH_SHORT).show()
//            }
//        }
    }
}
