package com.example.madwardrobe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class signin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signin)


        val button4 = findViewById<Button>(R.id.button10)
        val signup = findViewById<TextView>(R.id.signup)
        button4.setOnClickListener {
            val intent = Intent(this@signin, home::class.java)
            startActivity(intent)
        }

        signup.setOnClickListener {
            val intent = Intent(this@signin, signup::class.java)
            startActivity(intent)
        }
    }
}
