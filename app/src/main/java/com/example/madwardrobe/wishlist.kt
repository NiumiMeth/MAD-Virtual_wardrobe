package com.example.madwardrobe

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class wishlist : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.wishlist)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNav.selectedItemId = R.id.more // Set the selected item to the "more" tab or "wishlist" depending on the current activity

        // Handle Bottom Navigation Clicks
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    val intent = Intent(this@wishlist, home::class.java)
                    startActivity(intent)
                    finish() // Optionally, finish the current activity
                    true
                }
                R.id.style -> {
                    val intent = Intent(this@wishlist, tryoutfits::class.java)
                    startActivity(intent)
                    true
                }
                R.id.more -> {
                    // Navigate to the "more" activity
                    val intent = Intent(this@wishlist, more::class.java)
                    startActivity(intent)
                    true
                }
                R.id.wishlist -> {
                    // If we are already on the "wishlist" page, do nothing
                    true
                }
                else -> false
            }
        }
    }
}
