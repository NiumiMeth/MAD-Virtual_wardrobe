package com.example.madwardrobe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ob3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ob3)


         // Sign in button
        val button8 = findViewById<Button>(R.id.button8) // Sign up button

        button8.setOnClickListener {
            val intent = Intent(this@ob3, signin::class.java) // Replace with your sign-up activity
            startActivity(intent)
        }
    }
}
