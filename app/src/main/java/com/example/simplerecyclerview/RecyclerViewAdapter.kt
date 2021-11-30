package com.example.simplerecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {

    var data = listOf<ModelX>()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount() = data.size

    class MyViewHolder private constructor(item: View) : RecyclerView.ViewHolder(item) {
        private val titleText: TextView = item.findViewById(R.id.my_title)
        private val image: ImageView = item.findViewById(R.id.my_image_view)

        fun bind(item: ModelX){
            titleText.text = item.text
            image.setImageResource(R.drawable.info)
        }

        companion object {
            fun from(parent: ViewGroup): MyViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val view = layoutInflater
                    .inflate(R.layout.single_item, parent, false)
                return MyViewHolder(view)
            }
        }

    }

}
