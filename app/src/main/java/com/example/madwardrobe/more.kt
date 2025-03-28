package com.example.madwardrobe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class more : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.more)

        // Initialize UI elements

        val wishlistButton = findViewById<Button>(R.id.wishlist)
        val tryOutfitsButton = findViewById<Button>(R.id.tryout)
        val stylingButton = findViewById<Button>(R.id.styling)
        val accountImage = findViewById<ImageView>(R.id.accountImage)
        val addNewItemsButton = findViewById<Button>(R.id.addnewitem)
        val tutorialButton = findViewById<Button>(R.id.tute)
        val addNotesButton = findViewById<Button>(R.id.addNotes)
        val advancedButton = findViewById<Button>(R.id.advanced)
        val contactSupportButton = findViewById<Button>(R.id.contactSupport)
        val termsPoliciesButton = findViewById<Button>(R.id.termsPolicies)
        val privacyButton = findViewById<Button>(R.id.privacy)



        wishlistButton.setOnClickListener {
            startActivity(Intent(this@more, wishlist::class.java))
        }

        tryOutfitsButton.setOnClickListener {
            startActivity(Intent(this@more, tryoutfits::class.java))
        }

        accountImage.setOnClickListener {
            startActivity(Intent(this@more, profile::class.java))
        }

        addNewItemsButton.setOnClickListener {
            startActivity(Intent(this@more, addnewitems::class.java))
        }

        stylingButton.setOnClickListener {
            startActivity(Intent(this@more, styling::class.java))
        }

        tutorialButton.setOnClickListener {
            startActivity(Intent(this@more, tute::class.java))
        }

        addNotesButton.setOnClickListener {
            // Handle Add Notes click
            // Example: startActivity(Intent(this@more, AddNotesActivity::class.java))
        }

        advancedButton.setOnClickListener {
            // Handle Advanced click
            // Example: startActivity(Intent(this@more, AdvancedSettingsActivity::class.java))
        }

        contactSupportButton.setOnClickListener {
            // Handle Contact Support click
            // Example: startActivity(Intent(this@more, ContactSupportActivity::class.java))
        }

        termsPoliciesButton.setOnClickListener {
            // Handle Terms and Policies click
            // Example: startActivity(Intent(this@more, TermsPoliciesActivity::class.java))
        }

        privacyButton.setOnClickListener {
            // Handle Privacy click
            // Example: startActivity(Intent(this@more, PrivacyPolicyActivity::class.java))
        }

        // Bottom Navigation Setup
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNav.selectedItemId = R.id.more

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    startActivity(Intent(this@more, home::class.java))
                    finish()
                    true
                }
                R.id.style -> {
                    startActivity(Intent(this@more, tryoutfits::class.java))
                    true
                }
                R.id.more -> true // Already on "more" page
                else -> false
            }
        }
    }
}