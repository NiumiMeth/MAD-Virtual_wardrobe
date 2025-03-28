package com.example.madwardrobe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)



        val tshirt = findViewById<Button>(R.id.tshirt)
        val wishlist = findViewById<Button>(R.id.upgrade)
        val category = findViewById<TextView>(R.id.category)
        val profileIcon = findViewById<ImageView>(R.id.profile)

        // Navigate to stylingb when the tshirt button is clicked
        tshirt.setOnClickListener {
            val intent = Intent(this@home, stylingb::class.java)
            startActivity(intent)
        }

        wishlist.setOnClickListener {
            val intent = Intent(this@home, wishlist::class.java)
            startActivity(intent)
        }

        // Navigate to styling when the category text is clicked
        category.setOnClickListener {
            val intent = Intent(this@home, styling::class.java)
            startActivity(intent)
        }

        // Navigate to ProfileActivity when the profile icon is clicked
        profileIcon.setOnClickListener {
            val intent = Intent(this@home, profile::class.java)
            startActivity(intent)
        }

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNav.selectedItemId = R.id.home

        // Handle Bottom Navigation Clicks
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    // Do nothing if we're already on the home activity
                    true
                }
                R.id.style -> {
                    val intent = Intent(this@home, tryoutfits::class.java)
                    startActivity(intent)
                    true
                }
                R.id.more -> {
                    val intent = Intent(this@home, more::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }
}
