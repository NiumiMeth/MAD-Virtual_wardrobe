package com.example.madwardrobe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class stylingb : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.stylingb)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNav.selectedItemId = R.id.home

        // Handle Bottom Navigation Clicks
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    val intent = Intent(
                        this@stylingb,
                        home::class.java)
                    startActivity(intent)
                    finish()
                    true
                }
                R.id.style -> {
                    val intent = Intent(
                        this@stylingb,
                        tryoutfits::class.java)
                    startActivity(intent)
                    true
                }
                R.id.more -> {
                    val intent = Intent(
                        this@stylingb,
                        more::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }

}
