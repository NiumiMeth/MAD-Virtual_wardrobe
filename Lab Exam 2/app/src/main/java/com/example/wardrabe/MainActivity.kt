package com.example.wardrabe

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wardrabe.model.ClothingAdapter
import com.example.wardrobeapp.model.ClothingItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        val items = listOf(
            ClothingItem(
                "Red Dress", "Formal", R.drawable.red_dress.toString(),
                imageUrl = "https://example.com/red_dress.jpg",
                color = "Red",
                size = "M",
                brand = "ZARA",
                isFavorite = true
            ),

        )

        recyclerView.adapter = ClothingAdapter(items)
    }
}
}