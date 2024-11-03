package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class EditProfileIntroActivity : AppCompatActivity() {
    private lateinit var editTextFirstName: EditText
    private lateinit var editTextLastName: EditText
    private lateinit var editTextHeadline: EditText
    private lateinit var editTextPosition: EditText
    private lateinit var editTextEducation: EditText
    private lateinit var editTextLocation: EditText
    private lateinit var saveBtn: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile_intro)

        editTextFirstName = findViewById(R.id.edit_first_name)
        editTextLastName = findViewById(R.id.edit_last_name)
        editTextHeadline = findViewById(R.id.edit_headline)
        editTextPosition = findViewById(R.id.edit_position)
        editTextEducation = findViewById(R.id.edit_education)
        editTextLocation = findViewById(R.id.edit_location)
        saveBtn = findViewById(R.id.save_btn)

        // Get data from Intent
        val intent = intent
        val stringUserName = intent.getStringExtra("user_name") ?: ""
        val stringUserLocation = intent.getStringExtra("user_location") ?: ""

        // Split and assign values
        val split = stringUserName.split(" ")
        if (split.size > 1) {
            editTextFirstName.setText(split[0])
            editTextLastName.setText(split[1])
        } else {
            editTextFirstName.setText(stringUserName)
        }
        editTextLocation.setText(stringUserLocation)

        // Set a click listener for the save button
        saveBtn.setOnClickListener {
            // Save logic or transition code can be added here if needed
        }
    }
}
