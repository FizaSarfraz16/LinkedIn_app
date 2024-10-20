package com.example.myapplication

import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.HomeFragment
import com.example.myapplication.JobsFragment
import com.example.myapplication.NetworkFragment
import com.example.myapplication.NotificationFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class HomeActivity : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var profileImg: ImageView
    private lateinit var navImg: ImageView
    private lateinit var navCloseImg: ImageView
    private lateinit var navName: TextView
    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var mNavigationView: NavigationView
    private var selectedFragment: Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Drawer and Navigation setup
        drawerLayout = findViewById(R.id.drawerLayout)
        profileImg = findViewById(R.id.img)
        mNavigationView = findViewById(R.id.nav_view)

        // Header View in Navigation Drawer
        val headerView = mNavigationView.getHeaderView(0)
        navImg = headerView.findViewById(R.id.img)
        navCloseImg = headerView.findViewById(R.id.close_img)
        navName = headerView.findViewById(R.id.user_name)

        // Close drawer when the close icon is clicked
        navCloseImg.setOnClickListener {
            if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
                drawerLayout.closeDrawer(GravityCompat.START)
            }
        }

        // Set dummy User Info in the Drawer Header
        loadUserInfo()

        // Open drawer when profile image is clicked
        profileImg.setOnClickListener {
            if (!drawerLayout.isDrawerOpen(GravityCompat.START)) {
                drawerLayout.openDrawer(GravityCompat.START)
            } else {
                drawerLayout.closeDrawer(GravityCompat.START)
            }
        }

        // Bottom navigation click listener
        bottomNavigationView = findViewById(R.id.bottom_navigation_bar)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    selectedFragment = HomeFragment()
                }
                R.id.nav_network -> {
                    selectedFragment = NetworkFragment()
                }
                R.id.nav_notification -> {
                    selectedFragment = NotificationFragment()
                }
                R.id.nav_jobs -> {
                    selectedFragment = JobsFragment()
                }
            }
            if (selectedFragment != null) {
                supportFragmentManager.beginTransaction().replace(R.id.frame_layout, selectedFragment!!).commit()
            }
            true
        }
    }

    // Dummy loadUserInfo method to set sample user data
    private fun loadUserInfo() {
        navImg.setImageResource(R.drawable.user) // Set default user image
        navName.text = "John Doe" // Set default user name
    }
}
