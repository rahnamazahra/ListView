package com.example.listview.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.listview.R
import com.example.listview.mudle.Category

class CategoryRecyclerAdapter(val context:Context , val categories : List<Category> , val itemClick : (Category) -> Unit ) : RecyclerView.Adapter<CategoryRecyclerAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
      val view = LayoutInflater.from(context).inflate(R.layout.category_item , parent , false)
        return Holder(view , itemClick)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
           holder?.bindcategory(categories[position] , context)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }
    inner class Holder(itemView: View , val itemClick : (Category) -> Unit) : RecyclerView.ViewHolder(itemView){

        val categoryimage = itemView.findViewById<ImageView>(R.id.imageViewCategory)
        val categoryname = itemView.findViewById<TextView>(R.id.textViewCategory)

        fun bindcategory( category:Category ,  context:Context){
            val resorceId = context.resources.getIdentifier(category.image,"drawable",context.packageName)

            categoryimage?.setImageResource(resorceId)
            categoryname?.text = category.title

            itemView.setOnClickListener{ itemClick(category)}
        }
    }
}