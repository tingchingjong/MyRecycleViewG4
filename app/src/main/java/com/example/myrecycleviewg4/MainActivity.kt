package com.example.myrecycleviewg4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecycleviewg4.data.MyAdapter
import com.example.myrecycleviewg4.data.Product

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productList = listOf<Product>(
            Product("pen",2.50,R.drawable.ic_baseline_adb),
            Product("Computer",2500.00,R.drawable.ic_baseline_android),
            Product("Book",12.50,R.drawable.ic_baseline_adb),
            Product("Keyboard",20.00,R.drawable.ic_baseline_android),
            Product("Pencil", 2.50,R.drawable.ic_baseline_adb)
        )

        val recyclerView:RecyclerView = findViewById(R.id.productRecycleView)
        recyclerView.adapter = MyAdapter(productList)
        recyclerView.setHasFixedSize(true)
    }
}