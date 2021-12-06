package com.example.product_withfragments.model

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.product_withfragments.R

class ItemAdapter  (private val context: Context,
                      private val dataset: List<Product> ) :
       RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    class ItemViewHolder(private val view : View) : RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
        val textPrice: TextView = view.findViewById(R.id.item_price)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view, parent, false)

        return ItemAdapter.ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]

        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
        holder.textPrice.text = context.resources.getString(item.priceResourceId)
    }

    override fun getItemCount(): Int = dataset.size

    }

