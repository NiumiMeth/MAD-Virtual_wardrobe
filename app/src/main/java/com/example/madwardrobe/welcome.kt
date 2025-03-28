package com.example.madwardrobe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView // Correct import
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class welcome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.welcome)

        val button5 = findViewById<Button>(R.id.button5)
        val textView14 = findViewById<TextView>(R.id.textView14) // Correct type (TextView)

        button5.setOnClickListener {
            val intent = Intent(this@welcome, signup::class.java)
            startActivity(intent)
        }

        textView14.setOnClickListener {
            val intent = Intent(this@welcome, signin::class.java)
            startActivity(intent)
        }
    }
}
