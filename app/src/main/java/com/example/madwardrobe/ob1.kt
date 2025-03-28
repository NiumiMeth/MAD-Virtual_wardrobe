package com.example.madwardrobe

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ob1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ob1)


        val button4 = findViewById<Button>(R.id.button4)
        val button3 = findViewById<Button>(R.id.button3)

        button4.setOnClickListener {
            val intent = Intent(this@ob1, signin::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(this@ob1, ob2::class.java)
            startActivity(intent)
        }
    }
}
