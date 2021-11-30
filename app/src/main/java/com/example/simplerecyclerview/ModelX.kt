package com.example.simplerecyclerview

data class ModelX(
    val id: Int,
    val text: String,
    val nestedList: List<String>,
    var isExpandable: Boolean = false
)
