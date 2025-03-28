package com.example.madwardrobe

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


// Set an OnClickListener on the root layout
        val rootLayout = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.main)

        // When the user taps anywhere on the screen (within the root layout), navigate to the next activity
        rootLayout.setOnClickListener {
            // Create an Intent to navigate to the next activity (Ob1Activity)
            val intent = Intent(this@MainActivity, ob1::class.java)
            startActivity(intent)
            // Optionally, show a Toast or any other action
            Toast.makeText(this@MainActivity, "Navigating to OB1", Toast.LENGTH_SHORT).show()
        }
    }



}
