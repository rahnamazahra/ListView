package com.example.listview.Adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.listview.R
import com.example.listview.mudle.Category

class CategoryAdapter(var context:Context , var categories:List<Category>): BaseAdapter() {
    override fun getCount(): Int {
      return categories.count()
    }

    override fun getItem(p0: Int): Any {
        return categories[p0]
    }

    override fun getItemId(p0: Int): Long {
         return 0
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val categoryview : View
        val holder : ViewHolder

        if(p1 == null){
            categoryview = LayoutInflater.from(context).inflate(R.layout.category_item , null)
            holder = ViewHolder()
            holder.categoryimage = categoryview.findViewById(R.id.imageViewCategory)
            holder.categoryname = categoryview.findViewById(R.id.textViewCategory)
            Log.i("kotlin","creat raw !")

            categoryview.tag = holder

        }
        else{
            Log.i("kotlin","recycle !")
            holder = p1.tag as ViewHolder
            categoryview = p1


        }




        val category = categories[p0]
        val resorceId = context.resources.getIdentifier(category.image , "drawable" , context.packageName)
            holder.categoryname?.text = category.title

        holder.categoryimage?.setImageResource(resorceId)

        return categoryview
    }
}
class ViewHolder(){
    var categoryimage : ImageView ?= null
    var categoryname : TextView ?= null
}