
package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    // Declare view variables
    private lateinit var btnBack: ImageView
    private lateinit var imgEditProfile: ImageView
    private lateinit var name: TextView
    private lateinit var location: TextView
    private lateinit var aboutTxt: TextView
    private lateinit var headlineTxt: TextView
    private lateinit var btnMessage: Button
    private lateinit var btnConnect: Button
    private lateinit var btnMore: Button
    private lateinit var imgSetting: ImageView // Settings icon

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Initialize views
        initViews()

        // Set static user data
        setUserData()

        // Set up click listeners
        setupClickListeners()
    }

    private fun initViews() {
        btnBack = findViewById(R.id.btn_back)
        imgEditProfile = findViewById(R.id.edit_profile)
        name = findViewById(R.id.txt_name)
        location = findViewById(R.id.txt_location)
        aboutTxt = findViewById(R.id.aboutTxt)
        headlineTxt = findViewById(R.id.headlineTxt)
        imgSetting = findViewById(R.id.setting)

        // Button references
        btnMessage = findViewById(R.id.btn_message)
        btnConnect = findViewById(R.id.btn_connect)
        btnMore = findViewById(R.id.btn_more)
    }

    private fun setUserData() {
        name.text = "Fiza Sarfraz"
        location.text = "San Francisco, CA"
        headlineTxt.text = "Software Engineer"
        aboutTxt.text = "This is a static about section. Add a summary about yourself."
    }

    private fun setupClickListeners() {
        // Back Button
        btnBack.setOnClickListener { onBackPressed() }

        // Edit Profile
        imgEditProfile.setOnClickListener {
            // Open Edit Profile Activity
            val intent = Intent(this, EditProfileIntroActivity::class.java)
            intent.putExtra("user_name", name.text.toString())
            intent.putExtra("user_location", location.text.toString())
            startActivity(intent)
        }

        // Settings Button (if you want to implement settings)
        imgSetting.setOnClickListener {
            // Open Settings Activity if needed
            // val intent = Intent(this, SettingsActivity::class.java)
            // startActivity(intent)
        }

        // More Button Click Listener (if you want to implement more functionality)
        btnMore.setOnClickListener {
            // Add functionality for the "More" button if needed
        }

        // Message Button Click Listener (if you want to implement messaging)
        btnMessage.setOnClickListener {
            // Add functionality for the "Message" button if needed
        }

        // Connect Button Click Listener (if you want to implement connecting)
        btnConnect.setOnClickListener {
            // Add functionality for the "Connect" button if needed
        }
    }

    override fun onBackPressed() {
        super.onBackPressed() // This will handle the back navigation
    }
}
