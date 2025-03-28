package com.example.wardrabe.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.wardrabe.R
import com.example.wardrobeapp.model.ClothingItem

class ClothingAdapter(private val items: List<ClothingItem>) :
        RecyclerView.Adapter<ClothingAdapter.ViewHolder>() {

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val image: ImageView = view.findViewById(R.id.item_image)
            val name: TextView = view.findViewById(R.id.item_name)
            val category: TextView = view.findViewById(R.id.item_category)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_clothing, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = items[position]
            holder.name.text = item.name
            holder.category.text = item.category
            holder.image.setImageResource(item.imageRes)
        }

        override fun getItemCount(): Int = items.size
    }

