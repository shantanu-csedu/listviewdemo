package com.example.recyclerviewdemo

import android.R
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

class Adapter : RecyclerView.Adapter<ViewHolder>() {
    var values = mutableListOf<String>()
        set(value) {
            val oldMsg = field
            field = value
//            defaultCoroutineScope.launch {
            val diffResult =
                DiffUtil.calculateDiff(
                    MyDiffCallback(
                        oldMsg,
                        value
                    )
                )
//                withContext(Dispatchers.Main){
            diffResult.dispatchUpdatesTo(this)
//                }
//            }

        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.simple_list_item_1, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return values.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(values[position])
    }
}