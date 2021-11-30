package com.example.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import java.security.AccessController.getContext

class MainActivity : AppCompatActivity() {

    private lateinit var x: List<ModelX>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = RecyclerViewAdapter(RecyclerViewListener{
            Toast.makeText(this,"${x[it-1]}",Toast.LENGTH_SHORT).show()

        })
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = adapter

        x = listOf(
            ModelX(1,"SOHAIL",listOf("x","y","z")),
            ModelX(2,"SALMAN",listOf("x","y","z")),
            ModelX(3,"NIRGIN",listOf("x","y","z")),
            ModelX(4,"HANNAN",listOf("x","y","z")),
            ModelX(5,"NIKHATH",listOf("x","y","z")),
            ModelX(6,"MAARKHAI",listOf("x","y","z"))
        )

        adapter.submitList(x)

    }
}