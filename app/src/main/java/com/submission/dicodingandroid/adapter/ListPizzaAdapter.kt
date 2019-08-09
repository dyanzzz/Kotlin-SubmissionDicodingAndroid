package com.submission.dicodingandroid.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.submission.dicodingandroid.R
import com.submission.dicodingandroid.model.Pizza
import java.util.ArrayList

class ListPizzaAdapter(private val listPizza: ArrayList<Pizza>) : RecyclerView.Adapter<ListPizzaAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row_pizza, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val hero = listPizza[position]
        Glide.with(holder.itemView.context)
            .load(hero.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = hero.name
        holder.tvDescription.text = hero.description

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listPizza[holder.adapterPosition])
        }

    }

    override fun getItemCount(): Int {
        return listPizza.size
    }


    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        internal var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        internal var tvDescription: TextView = itemView.findViewById(R.id.tv_item_description)

    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Pizza)
    }

}
