package com.example.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = RecyclerViewAdapter()
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = adapter

        val x = listOf(
            ModelX(1,"SOHAIL"),
            ModelX(2,"SALMAN"),
            ModelX(3,"NIRGIN"),
            ModelX(4,"HANNAN"),
            ModelX(5,"NIKHATH"),
            ModelX(6,"MAARKHAI")
        )

        adapter.submitList(x)

    }
}