package com.example.listview.Services

import com.example.listview.mudle.Category
import com.example.listview.mudle.Product

object DataService {
    val categories = listOf(
        Category("توپ","ball_cover"),
        Category("دستکش","gloves_cover"),
        Category("قمقمه" , "flask_cover"),
        Category("کفش","shoe_cover")
    )
    val balls = listOf(
        Product("Ball #1","98,000 T","ball1"),
        Product("Ball #2","100,000 T","ball2"),
        Product("Ball #3","120,000 T","ball3"),
        Product("Ball #4","130,000 T","ball4"),
        Product("Ball #5","140,000 T","ball5"),
        Product("Ball #6","150,000 T","ball6")
    )
    val flasks = listOf(
        Product("Flask #1","10,000 T","flask1"),
        Product("Flask #2","20,000 T","flask2"),
        Product("Flask #3","30,000 T","flask3"),
        Product("Flask #4","40,000 T","flask4"),
        Product("Flask #5","50,000 T","flask5"),
        Product("Flask #6","60,000 T","flask6")
    )
    val gloves= listOf(
        Product("Gloves #1","100,000 T","gloves1"),
        Product("Gloves #2","200,000 T","gloves2"),
        Product("Gloves #3","300,000 T","gloves3"),
        Product("Gloves #4","400,000 T","gloves4"),
        Product("Gloves #5","500,000 T","gloves5"),
        Product("Gloves #6","600,000 T","gloves6")
    )
    val shoes = listOf(
        Product("Shoe #1" ,"200,000 T","shoe1"),
        Product("Shoe #2" ,"300,000 T","shoe2"),
        Product("Shoe #3" ,"400,000 T","shoe3"),
        Product("Shoe #4" ,"500,000 T","shoe4"),
        Product("Shoe #5" ,"600,000 T","shoe5"),
        Product("Shoe #6" ,"700,000 T","shoe6")
    )

    fun getProduct(categoryTitle:String) : List<Product>{
       return when(categoryTitle){
           "توپ" -> balls
           "دستکش" -> gloves
           "قمقمه" -> flasks
           "کفش" -> shoes
           else -> listOf<Product>()
       }
    }
}