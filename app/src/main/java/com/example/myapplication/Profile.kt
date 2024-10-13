package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.cardview.widget.CardView

class ProfileActivity : AppCompatActivity() {

    // Declare view variables
    private lateinit var imgEditAbout: ImageView
    private lateinit var imgEditProfile: ImageView
    private lateinit var btnBack: ImageView
    private lateinit var editAboutLayout: RelativeLayout
    private lateinit var name: TextView
    private lateinit var location: TextView
    private lateinit var aboutTxt: TextView
    private lateinit var headlineTxt: TextView
    private lateinit var editTextAbout: EditText
    private lateinit var saveAboutBtn: CardView

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
        //imgEditAbout = findViewById(R.id.img_edit)
        //imgEditProfile = findViewById(R.id.edit_profile)
        btnBack = findViewById(R.id.btn_back)
        //editAboutLayout = findViewById(R.id.edit_about_layout)
        name = findViewById(R.id.txt_name)
        location = findViewById(R.id.txt_location)
        aboutTxt = findViewById(R.id.aboutTxt)
        headlineTxt = findViewById(R.id.headlineTxt)
      //  editTextAbout = findViewById(R.id.about_edittext)
        //saveAboutBtn = findViewById(R.id.save_btn)
    }

    private fun setUserData() {
        name.text = "John Doe"
        location.text = "San Francisco, CA"
        headlineTxt.text = "Software Engineer"
        aboutTxt.text = "This is a static about section. Add a summary about yourself."
    }

    private fun setupClickListeners() {
        // Back Button
        btnBack.setOnClickListener { onBackPressed() }

        // Edit About Section
        imgEditAbout.setOnClickListener { editAboutLayout.visibility = View.VISIBLE }

        // Save Button
        saveAboutBtn.setOnClickListener {
            // Update the about text when "Save" is clicked
            aboutTxt.text = editTextAbout.text.toString()
            editAboutLayout.visibility = View.GONE // Hide edit layout after saving
        }

        // Edit Profile
        imgEditProfile.setOnClickListener {
            // Open Edit Profile Activity (static implementation)
            // Uncomment and implement as necessary
            /*
            val intent = Intent(this, EditProfileIntroActivity::class.java)
            intent.putExtra("user_name", name.text.toString())
            intent.putExtra("user_location", location.text.toString())
            startActivity(intent)
            */
        }
    }

    override fun onBackPressed() {
        if (editAboutLayout.visibility == View.VISIBLE) {
            editAboutLayout.visibility = View.GONE // Hide edit layout if it's visible
        } else {
            super.onBackPressed() // Otherwise, perform the normal back action
        }
    }
}
