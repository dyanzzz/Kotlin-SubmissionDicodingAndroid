package com.submission.dicodingandroid.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.submission.dicodingandroid.DetailMenu
import com.submission.dicodingandroid.R
import com.submission.dicodingandroid.model.Pizza
import java.util.ArrayList

class CardViewPizzaAdapter(private val listPizza: ArrayList<Pizza>) :
    RecyclerView.Adapter<CardViewPizzaAdapter.CardViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_pizza, parent, false)
        return CardViewViewHolder(view)

    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {

        val pizza = listPizza[position]
        Glide.with(holder.itemView.context)
            .load(pizza.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.text = pizza.name
        holder.tvDescription.text = pizza.description
        holder.tvPrice.text = pizza.price
        holder.btnFavorite.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "Favorite " + listPizza[holder.adapterPosition].name!!,
                Toast.LENGTH_SHORT
            ).show()
        }
        holder.btnShare.setOnClickListener {
            Toast.makeText(
                holder.itemView.context,
                "Share " + listPizza[holder.adapterPosition].name!!,
                Toast.LENGTH_SHORT
            ).show()


        }
        holder.itemView.setOnClickListener {
            //Toast.makeText(
                //holder.itemView.context,
                //"Kamu memilih pizza "+listPizza[position].name,
                //Toast.LENGTH_SHORT
            //).show()

            val moveWithDataIntent = Intent(holder.itemView.context, DetailMenu::class.java)
            moveWithDataIntent.putExtra(DetailMenu.EXTRA_NOMOR, listPizza[position].nomor)
            moveWithDataIntent.putExtra(DetailMenu.EXTRA_NAME, listPizza[position].name)
            moveWithDataIntent.putExtra(DetailMenu.EXTRA_DESCRIPTION, listPizza[position].description)
            moveWithDataIntent.putExtra(DetailMenu.EXTRA_PHOTO, listPizza[position].photo)
            moveWithDataIntent.putExtra(DetailMenu.EXTRA_CATEGORY, listPizza[position].category)
            moveWithDataIntent.putExtra(DetailMenu.EXTRA_PRICE, listPizza[position].price)
            moveWithDataIntent.putExtra(DetailMenu.EXTRA_RECEIP, listPizza[position].receip)
            holder.itemView.context.startActivity(moveWithDataIntent)

        }

    }


    override fun getItemCount(): Int {
        return listPizza.size
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView
        var tvName: TextView
        var tvDescription: TextView
        var tvPrice: TextView
        var btnFavorite: Button
        var btnShare: Button

        init {
            imgPhoto = itemView.findViewById(R.id.img_item_photo)
            tvName = itemView.findViewById(R.id.tv_item_name)
            tvDescription = itemView.findViewById(R.id.tv_item_description)
            tvPrice = itemView.findViewById(R.id.tv_item_price)
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite)
            btnShare = itemView.findViewById(R.id.btn_set_share)
        }
    }
}
