package com.example.shoppinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val arrayList = ArrayList<Model>()

        arrayList.add(Model("Bags", "My New shopping Bag", R.drawable.bags))
        arrayList.add(Model("Shoes", "My New shopping shoes", R.drawable.shoes))
        arrayList.add(Model("Shirt", "My New shopping shirt", R.drawable.clothes))
        arrayList.add(Model("Television", "This is my new television", R.drawable.bags))
        arrayList.add(Model("Phone", "This is my new phone", R.drawable.phones))
        arrayList.add(Model("Watch", "My new watch", R.drawable.watch))

        val shopListAdapter = ShopListAdapter(arrayList, this)

        recyclierView.layoutManager = LinearLayoutManager(this )
        recyclierView.adapter  = shopListAdapter
    }
}
