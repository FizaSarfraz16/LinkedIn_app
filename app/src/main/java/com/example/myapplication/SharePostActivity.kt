package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.myapplication.R

class SharePostActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var postImg: ImageView
    private lateinit var selectImgBtn: ImageView
    private lateinit var userName: TextView
    private lateinit var postBtn: TextView
    private var imageUri: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_share_post)

        // Initialize UI components
        editText = findViewById(R.id.edit_text)
        postImg = findViewById(R.id.post_img)
        selectImgBtn = findViewById(R.id.btn_select_img)
        userName = findViewById(R.id.user_name)
        postBtn = findViewById(R.id.btn_post)

        // Set username from dummy data or shared preferences if available
        userName.text = "User Name"

        // Set up image selection without cropping
        selectImgBtn.setOnClickListener { openImageChooser() }

        // Set up post button functionality
        postBtn.setOnClickListener {
            val postContent = editText.text.toString()
            if (postContent.isNotEmpty() || imageUri != null) {
                // Process or display post content and image
                Toast.makeText(this, "Post submitted", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please add content or an image", Toast.LENGTH_SHORT).show()
            }
        }

        // Handle text changes in the post field
        editText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                postBtn.setTextColor(Color.BLACK)
            }
            override fun afterTextChanged(s: Editable) {}
        })
    }

    // Function to open the image chooser
    private fun openImageChooser() {
        val intent = Intent(Intent.ACTION_GET_CONTENT).apply { type = "image/*" }
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data != null) {
            data.data?.let { uri ->
                imageUri = uri
                // Load the selected image directly into the ImageView
                Glide.with(this).load(imageUri).into(postImg)
            }
        }
    }

    companion object {
        private const val PICK_IMAGE_REQUEST = 1
    }
}
