package com.example.wardrobeapp.model

data class ClothingItem(
    val id: String,          // Unique ID for each item (use UUID or Firebase ID)
    val name: String,        // Name of the clothing item (e.g., "Red Dress")
    val category: String,    // Category (e.g., "Casual", "Formal", "Winter")
    val imageUrl: String,    // URL or local path for the clothing image
    val color: String?,      // Optional: Color description (e.g., "Red", "Blue")
    val size: String?,       // Optional: Clothing size (e.g., "M", "L")
    val brand: String?,      // Optional: Clothing brand (e.g., "Nike", "Zara")
    val isFavorite: Boolean  // To mark favorite outfits
) {
    val imageRes: Int
}
