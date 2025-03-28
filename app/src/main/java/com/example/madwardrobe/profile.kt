package com.example.madwardrobe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)


        val update = findViewById<Button>(R.id.update)


        // Navigate to stylingb when the tshirt button is clicked
        update.setOnClickListener {
            val intent = Intent(this@profile, home::class.java)
            startActivity(intent)
        }

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNav.selectedItemId = R.id.home

        // Handle Bottom Navigation Clicks
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    val intent = Intent(
                        this@profile,
                        home::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.style -> {
                    val intent = Intent(
                        this@profile,
                        tryoutfits::class.java)
                    startActivity(intent)
                    true
                }
                R.id.more -> {
                    val intent = Intent(
                        this@profile,
                        more::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }
}
