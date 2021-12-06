package com.example.product_withfragments.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


open class Product (@StringRes val stringResourceId: Int,
                    @DrawableRes val imageResourceId: Int,
                    @StringRes val priceResourceId : Int,
                    val isVip: Boolean,
                    @StringRes val NumResourceId : Int)