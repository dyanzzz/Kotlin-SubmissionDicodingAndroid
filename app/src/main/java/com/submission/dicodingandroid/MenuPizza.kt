package com.submission.dicodingandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.submission.dicodingandroid.adapter.CardViewPizzaAdapter
import com.submission.dicodingandroid.adapter.GridPizzaAdapter
import com.submission.dicodingandroid.adapter.ListPizzaAdapter
import com.submission.dicodingandroid.model.Pizza
import com.submission.dicodingandroid.model.PizzaData

@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class MenuPizza : AppCompatActivity() {

    private lateinit var rvPizza: RecyclerView
    private var list: ArrayList<Pizza> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_pizza)

        val category = intent.getStringExtra(EXTRA_CATEGORY)

        val actionbar = supportActionBar
        actionbar!!.title = category
        actionbar.setDisplayHomeAsUpEnabled(true)

        rvPizza = findViewById(R.id.rv_pizza)
        rvPizza.setHasFixedSize(true)

        PizzaData.valueCategory = category
        list.addAll(PizzaData.listData)
        showRecyclerList()

    }

    companion object{
        const val EXTRA_CATEGORY = "extra_category"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                title = "Mode List"
                showRecyclerList()
            }

            R.id.action_grid -> {
                title = "Mode Grid"
                showRecyclerGrid()
            }

            R.id.action_cardview -> {
                title = "Mode CardView"
                showRecyclerCardView()
            }
        }

    }


    private fun showRecyclerList() {
        rvPizza.layoutManager = LinearLayoutManager(this)
        val listPizzaAdapter = ListPizzaAdapter(list)
        rvPizza.adapter = listPizzaAdapter

        listPizzaAdapter.setOnItemClickCallback(object : ListPizzaAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Pizza) {
                showSelectedPizza(data)
            }
        })
    }

    private fun showRecyclerGrid() {
        rvPizza.layoutManager = GridLayoutManager(this, 2)
        val gridPizzaAdapter = GridPizzaAdapter(list)
        rvPizza.adapter = gridPizzaAdapter

        gridPizzaAdapter.setOnItemClickCallback(object : GridPizzaAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Pizza) {
                showSelectedPizza(data)
            }
        })
    }

    private fun showRecyclerCardView() {
        rvPizza.layoutManager = LinearLayoutManager(this)
        val cardViewPizzaAdapter = CardViewPizzaAdapter(list)
        rvPizza.adapter = cardViewPizzaAdapter


    }

    private fun showSelectedPizza(hero: Pizza) {
        //Toast.makeText(this, "Kamu memilih " + hero.nomor + hero.name, Toast.LENGTH_SHORT).show()
        val moveWithDataIntent = Intent(this@MenuPizza, DetailMenu::class.java)
        moveWithDataIntent.putExtra(DetailMenu.EXTRA_NOMOR, hero.nomor)
        moveWithDataIntent.putExtra(DetailMenu.EXTRA_NAME, hero.name)
        moveWithDataIntent.putExtra(DetailMenu.EXTRA_DESCRIPTION, hero.description)
        moveWithDataIntent.putExtra(DetailMenu.EXTRA_PHOTO, hero.photo)
        moveWithDataIntent.putExtra(DetailMenu.EXTRA_CATEGORY, hero.category)
        moveWithDataIntent.putExtra(DetailMenu.EXTRA_PRICE, hero.price)
        moveWithDataIntent.putExtra(DetailMenu.EXTRA_RECEIP, hero.receip)
        startActivity(moveWithDataIntent)
    }

    //appbar - toolbar button click
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    //menu
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)

    }
}
