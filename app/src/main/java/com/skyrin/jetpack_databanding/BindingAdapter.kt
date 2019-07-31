package com.skyrin.jetpack_databanding

import android.content.Context
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter

@BindingAdapter("app:popularityColor")
fun popularityColor(view: TextView, popularity: Popularity) {
    val color = getColorPopularity(view.context,popularity)
    view.setTextColor(color)
}

@BindingAdapter("app:popularityText")
fun popularityText(view: TextView, popularity: Popularity) {
    view.text = getTextPopularity(popularity)
}

fun getTextPopularity(popularity: Popularity): String? {
    return when (popularity) {
        Popularity.NORMAL -> "😀"
        Popularity.POPULAR -> "🔥"
        Popularity.STAR -> "👑"
    }
}

fun getColorPopularity(context: Context, popularity: Popularity): Int {
    return when (popularity) {
        Popularity.NORMAL -> ContextCompat.getColor(context, R.color.normal)
        Popularity.POPULAR -> ContextCompat.getColor(context, R.color.popular)
        Popularity.STAR -> ContextCompat.getColor(context, R.color.star)
    }
}