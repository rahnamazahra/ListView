package com.example.listview.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listview.Adapters.CategoryAdapter
import com.example.listview.Adapters.CategoryRecyclerAdapter
import com.example.listview.R
import com.example.listview.Services.DataService
import com.example.listview.Utilities.EXTRA_CATEGORY
import com.example.listview.mudle.Category
import com.example.listview.mudle.Product
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var categoriesAdapter : CategoryRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        categoriesAdapter = CategoryRecyclerAdapter(this,DataService.categories){category ->
            //Toast.makeText(this,category.title,Toast.LENGTH_LONG).show()
          val productIntent = Intent(this,ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY , category.title)
            startActivity(productIntent)


        }
        CategoryListView.adapter = categoriesAdapter

          val layoutManager = LinearLayoutManager(this)
          CategoryListView.layoutManager = layoutManager
          CategoryListView.setHasFixedSize(true)

    }
}