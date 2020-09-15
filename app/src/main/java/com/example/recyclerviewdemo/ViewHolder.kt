package com.example.recyclerviewdemo

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val textView : TextView = itemView.findViewById(android.R.id.text1)
    fun bind(s: String) {
        textView.text = s
    }
}