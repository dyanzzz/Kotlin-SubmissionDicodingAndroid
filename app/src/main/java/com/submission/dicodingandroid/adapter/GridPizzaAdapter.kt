package com.submission.dicodingandroid.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.submission.dicodingandroid.R
import com.submission.dicodingandroid.model.Pizza
import java.util.ArrayList

class GridPizzaAdapter(private val listPizza: ArrayList<Pizza>) :
    RecyclerView.Adapter<GridPizzaAdapter.GridViewHolder>() {

    private lateinit var  onItemClickCallback: OnItemClickCallback


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_grid_pizza, parent, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listPizza[position].photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listPizza[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listPizza.size
    }

    inner class GridViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var imgPhoto: ImageView

        init {
            imgPhoto = itemView.findViewById(R.id.img_item_photo)
        }
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback{
        fun onItemClicked(data: Pizza)
    }

}
