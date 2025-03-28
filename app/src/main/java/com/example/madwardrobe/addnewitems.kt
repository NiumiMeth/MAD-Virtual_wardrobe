package com.example.madwardrobe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class addnewitems : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_new_items)



        val upload = findViewById<ImageView>(R.id.upload)

        upload.setOnClickListener {
            val intent = Intent(this@addnewitems, camera::class.java)  // Replace ProfileActivity with your actual profile activity class
            startActivity(intent)
        }
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNav.selectedItemId = R.id.home

        // Handle Bottom Navigation Clicks
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    val intent = Intent(
                        this@addnewitems,
                        home::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.style -> {
                    val intent = Intent(
                        this@addnewitems,
                        tryoutfits::class.java)
                    startActivity(intent)
                    true
                }
                R.id.more -> {
                    val intent = Intent(
                        this@addnewitems,
                        more::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }
}
