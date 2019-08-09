package com.submission.dicodingandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail_menu_content.*

class DetailMenu : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_menu)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val item_photo: ImageView = findViewById(R.id.item_photo)
        val item_photo_qty: TextView = findViewById(R.id.item_photo_qty)
        val item_name: TextView = findViewById(R.id.item_name)
        val item_description: TextView = findViewById(R.id.item_description)
        //val item_category: TextView = findViewById(R.id.item_category)
        val item_price: TextView = findViewById(R.id.item_price)
        val item_receip: TextView = findViewById(R.id.item_receip)
        val btn_buy: Button = findViewById(R.id.btn_buy)

        val name        = intent.getStringExtra(EXTRA_NAME)
        val description = intent.getStringExtra(EXTRA_DESCRIPTION)
        val photo       = intent.getStringExtra(EXTRA_PHOTO)
        val category    = intent.getStringExtra(EXTRA_CATEGORY)
        val price       = intent.getStringExtra(EXTRA_PRICE)
        val receip      = intent.getStringExtra(EXTRA_RECEIP)


        item_name.text = name
        item_description.text = description
        //item_category.text = category
        item_price.text = price
        item_receip.text = receip
        item_photo_qty.text = category

        Glide.with(this)
            .load(photo)
            .into(item_photo)

        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = name
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)

        btn_buy.setOnClickListener(this)
        //btn_buy.onClik

    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.btn_buy->{
                Toast.makeText(
                    this,
                    "I will order this "+item_name.text,
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    companion object{
        const val EXTRA_NOMOR       = "extra_nomor"
        const val EXTRA_NAME        = "extra_name"
        const val EXTRA_DESCRIPTION = "extra_description"
        const val EXTRA_PHOTO       = "extra_photo"
        const val EXTRA_CATEGORY    = "extra_category"
        const val EXTRA_PRICE       = "extra_price"
        const val EXTRA_RECEIP      = "extra_receip"

    }
}


