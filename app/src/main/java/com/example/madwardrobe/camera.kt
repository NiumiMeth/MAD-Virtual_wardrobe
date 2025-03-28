package com.example.madwardrobe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class camera : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.camera)

        val imageView4 = findViewById<ImageView>(R.id.imageView4)

        imageView4.setOnClickListener {
            val intent = Intent(this@camera, choosephoto::class.java)  // Replace ProfileActivity with your actual profile activity class
            startActivity(intent)
        }
    }
}
