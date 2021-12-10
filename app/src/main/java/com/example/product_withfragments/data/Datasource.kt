package com.example.product_withfragments.data

import com.example.product_withfragments.R
import com.example.product_withfragments.model.Product

class Datasource {

    fun loadProduct(): List<Product> {
        return listOf<Product>(
            Product(R.string.product1,R.drawable.product1,R.string.price1,true,R.string.quantityNumber1),
            Product(R.string.product2,R.drawable.product2,R.string.price2,false,R.string.quantityNumber2),
            Product(R.string.product3, R.drawable.product3,R.string.price3,true,R.string.quantityNumber3),
            Product(R.string.product4,R.drawable.product4,R.string.price4,false,R.string.quantityNumber4),
            Product(R.string.product5,R.drawable.product5,R.string.price5,true,R.string.quantityNumber5),
            Product(R.string.product6,R.drawable.product6,R.string.price6,true,R.string.quantityNumber6)

            )
    }
}