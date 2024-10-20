//package com.example.myapplication
//
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Button
//import android.widget.EditText
//import android.widget.Toast
//
//class SignIn : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_sign_in)
//
//        // Initialize views
//        val emailPhoneInput = findViewById<EditText>(R.id.EtEmail)
//        val passwordInput = findViewById<EditText>(R.id.EtPass)
//        val signInButton = findViewById<Button>(R.id.btn_continue)
//
//        // Handle Sign In button click
//        signInButton.setOnClickListener {
//            val emailPhone = emailPhoneInput.text.toString()
//            val password = passwordInput.text.toString()
//
//            if (emailPhone.isNotEmpty() && password.isNotEmpty()) {
//
//                Toast.makeText(this, "Sign In successful!", Toast.LENGTH_SHORT).show()
//
//                // For example, navigate to another activity
//                val intent = Intent(this, MainActivity::class.java)
//                startActivity(intent)
//                finish()
//            } else {
//                // Show error message
//                Toast.makeText(this, "Please enter all details", Toast.LENGTH_SHORT).show()
//            }
//        }
//    }
//}
package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SignIn : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        // Initialize views
        val emailPhoneInput = findViewById<EditText>(R.id.EtEmail)
        val passwordInput = findViewById<EditText>(R.id.EtPass)
        val signInButton = findViewById<Button>(R.id.btn_continue)
        val joinNowText = findViewById<TextView>(R.id.txt_join_now)

        // Handle Sign In button click
        signInButton.setOnClickListener {
            val emailPhone = emailPhoneInput.text.toString()
            val password = passwordInput.text.toString()

            if (emailPhone.isNotEmpty() && password.isNotEmpty()) {
                Toast.makeText(this, "Sign In successful!", Toast.LENGTH_SHORT).show()

                // Navigate to MainActivity or another appropriate activity
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                // Show error message if fields are empty
                Toast.makeText(this, "Please enter all details", Toast.LENGTH_SHORT).show()
            }
        }

        // Handle "Join Now" text click
        joinNowText.setOnClickListener {
            val intent = Intent(this, JoinNowActivity::class.java)
            startActivity(intent)
        }
    }
}

