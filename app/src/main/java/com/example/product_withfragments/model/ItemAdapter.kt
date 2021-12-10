package com.example.product_withfragments.model

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.product_withfragments.ProductListDirections
import com.example.product_withfragments.R
import com.example.product_withfragments.databinding.FragmentProductListBinding
import kotlinx.android.synthetic.main.item_view.view.*


class ItemAdapter  (private val context: Context,
                      private val dataset: List<Product> ) :
       RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val phoneName: TextView = view.findViewById(R.id.item_title)
        val phoneImage: ImageView = view.findViewById(R.id.item_image)
        val textPrice: TextView = view.findViewById(R.id.item_price)
        val next: Button = view.findViewById((R.id.buy))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            // here error
            .inflate(R.layout.item_view, parent, false)

        return ItemViewHolder(adapterLayout)

    }


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        // set products to be visible on fragment list
        holder.apply {
            phoneImage.setImageResource(item.phoneImage)
            phoneName.text = context.getText(item.phoneName)
            textPrice.text = context.getText(item.textPrice)




            if (item.isVip) {
                holder.itemView.btnStar.visibility = View.VISIBLE
            }

            // here condition not work

            holder.next.setOnClickListener {
                if (item.phoneQuantity > 0 ){

                    val action = ProductListDirections.actionProductListToProductDetail(

                        nameOfPhone = context.getString(item.phoneName),
                        //context.getString(item.textPrice)
                        price = item.textPrice ,

                    )
                    // Navigate using that action
                    holder.itemView.findNavController().navigate(action)

                } else if (item.phoneQuantity == 0 ){
                    Toast.makeText(context, "The item is out of stock", Toast.LENGTH_SHORT).show()
                }
            }

        }

    }

    override fun getItemCount(): Int = dataset.size

  }

