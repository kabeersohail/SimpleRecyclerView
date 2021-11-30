package com.example.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import java.security.AccessController.getContext

class MainActivity : AppCompatActivity() {
    lateinit var x: List<ModelX>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = RecyclerViewAdapter(RecyclerViewListener{
            Toast.makeText(this,"$it",Toast.LENGTH_SHORT).show()
            val isExpanded = x[it.toInt()-1].isExpanded.get()
            x[it.toInt()-1].isExpanded.set(!isExpanded!!)
            Log.d("SOHAIL","$it")
        })
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = adapter

        x = listOf(
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