package com.example.simplerecyclerview

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("Title")
fun TextView.setTitle(item: ModelX?){
    item?.let {
        text = it.text
    }
}

@BindingAdapter("Id")
fun TextView.setId(item: ModelX?){
    item?.let {
        text = it.id.toString()
    }
}

@BindingAdapter("Image")
fun ImageView.setImage(item: ModelX?){
    item?.let {
        setImageResource(R.drawable.info)
    }
}
