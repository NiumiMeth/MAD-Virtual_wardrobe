package com.example.madwardrobe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class signup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        val button17 = findViewById<Button>(R.id.button17)
        val textView18 = findViewById<TextView>(R.id.textView18)
        button17.setOnClickListener {
            val intent = Intent(this@signup, home::class.java)
            startActivity(intent)
        }

        textView18.setOnClickListener {
            val intent = Intent(this@signup, signin::class.java)
            startActivity(intent)
        }
    }
}
