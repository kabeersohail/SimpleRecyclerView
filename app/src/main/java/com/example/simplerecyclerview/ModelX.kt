package com.example.simplerecyclerview

import androidx.databinding.ObservableField

data class ModelX(
    val id: Long,
    val text: String,
    var isExpanded: ObservableField<Boolean> = ObservableField(false)
)
