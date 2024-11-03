package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class HomeActivity : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var profileImg: ImageView
    private lateinit var navCloseImg: ImageView
    private lateinit var navName: TextView
    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var mNavigationView: NavigationView
    private lateinit var addPostButton: ImageView
    private var selectedFragment: Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Initialize Views
        drawerLayout = findViewById(R.id.drawerLayout)
        profileImg = findViewById(R.id.img)
        mNavigationView = findViewById(R.id.nav_view)

        // Get the Header View from Navigation Drawer
        val headerView = mNavigationView.getHeaderView(0)
        navCloseImg = headerView.findViewById(R.id.close_img)
        navName = headerView.findViewById(R.id.user_name)
        val navProfileImg: ImageView = headerView.findViewById(R.id.img)

        // Set up click listeners
        setupClickListeners(navProfileImg)

        // Load User Info in Drawer
        loadUserInfo()

        // Initialize Bottom Navigation and set default fragment
        setupBottomNavigation()

        // Load the default fragment on startup
        if (savedInstanceState == null) {
            bottomNavigationView.selectedItemId = R.id.nav_home // Set default selected item
        }
    }

    private fun setupClickListeners(navProfileImg: ImageView) {
        // Close drawer when close icon is clicked
        navCloseImg.setOnClickListener {
            if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                drawerLayout.closeDrawer(GravityCompat.START)
            }
        }

        // Open drawer when profile image in header is clicked
        profileImg.setOnClickListener {
            if (!drawerLayout.isDrawerOpen(GravityCompat.START)) {
                drawerLayout.openDrawer(GravityCompat.START)
            } else {
                drawerLayout.closeDrawer(GravityCompat.START)
            }
        }
        // Initialize the add post button
        addPostButton = findViewById(R.id.addPostBtn)

        // Set an OnClickListener to open SharePostActivity
        addPostButton.setOnClickListener {
            val intent = Intent(this, SharePostActivity::class.java)
            startActivity(intent)
        }
        // Navigate to ProfileActivity when profile image in the drawer header is clicked
        navProfileImg.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            drawerLayout.closeDrawer(GravityCompat.START) // Close drawer after navigation
        }
    }

    private fun loadUserInfo() {
        // Dummy user information
        navName.text = "John Doe"
    }

    private fun setupBottomNavigation() {
        bottomNavigationView = findViewById(R.id.bottom_navigation_bar)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> selectedFragment = HomeFragment()
                R.id.nav_network -> selectedFragment = NetworkFragment()
                R.id.nav_notification -> selectedFragment = NotificationFragment()
                R.id.nav_jobs -> selectedFragment = JobsFragment()
            }
            // Replace fragment if one is selected
            selectedFragment?.let {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frame_layout, it)
                    .addToBackStack(null)
                    .commit()
            }
            true
        }
    }
}
