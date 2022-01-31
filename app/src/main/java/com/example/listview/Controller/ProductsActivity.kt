package com.example.listview.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.example.listview.Adapters.ProductAdapter
import com.example.listview.R
import com.example.listview.Services.DataService
import com.example.listview.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {
    lateinit var adapter : ProductAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryTitle = intent.getStringExtra(EXTRA_CATEGORY)
        textviewproductsTitle.text = categoryTitle

        adapter = ProductAdapter(this, DataService.getProduct(categoryTitle.toString()))
        val layoutManager = GridLayoutManager(this, 2)
         ProductsListView.adapter = adapter
        ProductsListView.layoutManager = layoutManager
    }
}