package com.submission.dicodingandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.RelativeLayout

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPizza: RelativeLayout = findViewById(R.id.relative_pizza)
        val btnPasta: RelativeLayout = findViewById(R.id.relative_pasta)
        val btnRice: RelativeLayout = findViewById(R.id.relative_rice)
        val btnDrink: RelativeLayout = findViewById(R.id.relative_drink)

        btnPizza.setOnClickListener(this)
        btnPasta.setOnClickListener(this)
        btnRice.setOnClickListener(this)
        btnDrink.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id){

            R.id.relative_pizza->{
                val moveWithDataIntent = Intent(this@MainActivity, MenuPizza::class.java)
                moveWithDataIntent.putExtra(MenuPizza.EXTRA_CATEGORY, "Pizza")
                startActivity(moveWithDataIntent)

            }

            R.id.relative_pasta->{
                val moveWithDataIntent = Intent(this@MainActivity, MenuPizza::class.java)
                moveWithDataIntent.putExtra(MenuPizza.EXTRA_CATEGORY, "Pasta")
                startActivity(moveWithDataIntent)

            }

            R.id.relative_rice->{
                val moveWithDataIntent = Intent(this@MainActivity, MenuPizza::class.java)
                moveWithDataIntent.putExtra(MenuPizza.EXTRA_CATEGORY, "Rice")
                startActivity(moveWithDataIntent)

            }

            R.id.relative_drink->{
                val moveWithDataIntent = Intent(this@MainActivity, MenuPizza::class.java)
                moveWithDataIntent.putExtra(MenuPizza.EXTRA_CATEGORY, "Drink")
                startActivity(moveWithDataIntent)

            }

        }
    }


    //appbar - toolbar button click
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {

            R.id.action_profil -> {
                val moveIntent = Intent(this@MainActivity, Profile::class.java)
                startActivity(moveIntent)
                true
            }

            else -> super.onOptionsItemSelected(item)

        }
    }

    //menu
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_profile, menu)
        return super.onCreateOptionsMenu(menu)

    }



}
