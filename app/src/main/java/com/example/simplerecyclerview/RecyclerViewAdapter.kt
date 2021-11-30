package com.example.simplerecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.simplerecyclerview.databinding.SingleItemBinding

class RecyclerViewAdapter(val clickListener: RecyclerViewListener) : ListAdapter<ModelX,RecyclerViewAdapter.MyViewHolder>(RecyclerViewDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(getItem(position),clickListener)
    }

    class MyViewHolder private constructor(private val binding: SingleItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: ModelX, clickListener: RecyclerViewListener) {
            binding.data = item
            binding.clickListener = clickListener
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): MyViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = SingleItemBinding.inflate(layoutInflater, parent,false)
                return MyViewHolder(binding)
            }
        }
    }

    class RecyclerViewDiffCallback: DiffUtil.ItemCallback<ModelX>(){
        override fun areItemsTheSame(oldItem: ModelX, newItem: ModelX): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: ModelX, newItem: ModelX): Boolean {
            return oldItem == newItem
        }

    }

}

class RecyclerViewListener(val listener: (id: Long) -> Unit){
    fun onClick(data: ModelX) { listener(data.id) }
}
