package com.example.w2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val openCloset = findViewById<Button>(R.id.openCloset)
        openCloset.setOnClickListener {
            val intent = Intent(
                this@MainActivity,
                ClosetActivity::class.java
            )
            startActivity(intent)
        }
    }
}
