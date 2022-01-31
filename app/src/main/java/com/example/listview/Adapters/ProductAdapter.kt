package com.example.listview.Adapters

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.system.Os.bind
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.listview.R
import com.example.listview.Services.DataService.categories
import com.example.listview.mudle.Product

class ProductAdapter(val context: Context , val product:List<Product>) : RecyclerView.Adapter<ProductAdapter.ProductHolder>() {
    
    inner class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val productimage = itemView.findViewById<ImageView>(R.id.imageViewProductImage)
        val productname = itemView.findViewById<TextView>(R.id.textViewProductName)
        val productprice = itemView.findViewById<TextView>(R.id.textViewProductPrice)

        fun bindproduct(product:Product ,context:Context ){
            val resorceId = context.resources.getIdentifier(product.image,"drawable",context.packageName)

            productimage?.setImageResource(resorceId)
            productname?.text = product.title
            productprice?.text = product.price

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_item , parent , false)
        return ProductHolder(view)
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.bindproduct(product[position] , context)
    }

    override fun getItemCount(): Int {
     return product.count()
    }


}