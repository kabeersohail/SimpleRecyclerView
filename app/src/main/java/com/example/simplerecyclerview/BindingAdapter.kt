package com.example.simplerecyclerview

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("titleAdapter")
fun TextView.setTitle(item: ModelX?){
    item?.let {
        text = it.text
    }
}

@BindingAdapter("idAdapter")
fun TextView.setId(item: ModelX?){
    item?.let {
        text = it.id.toString()
    }
}

@BindingAdapter("imageAdapter")
fun ImageView.setImage(item: ModelX?){
    item?.let {
        setImageResource(R.drawable.info)
    }
}
