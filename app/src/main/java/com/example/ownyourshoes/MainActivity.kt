package com.example.ownyourshoes

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private lateinit var rvActivityMain : RecyclerView
private var listMainActivity: ArrayList<Shoes> = arrayListOf()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvActivityMain = findViewById(R.id.rv_activity_main)
        rvActivityMain.setHasFixedSize(true)

        listMainActivity.apply {
            clear() // Untuk menghapus list setelah app ditutup
            addAll(ShoesData.listData)
        }
        showRecyclerList()

    }

    private fun showRecyclerList() {
        rvActivityMain.layoutManager = LinearLayoutManager(this)
        val listAdapter = ListAdapter(listMainActivity)
        rvActivityMain.adapter = listAdapter

        listAdapter.setOnItemClickCallback(object : ListAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Shoes) {
                showSelectedShoes(data)
            }
        })
    }

    private fun showSelectedShoes(shoesSelected: Shoes){
        val kedetail = Intent(this@MainActivity, DetailActivity::class.java)
            kedetail.apply {
                putExtra(DetailActivity.EXTRA_IMG, shoesSelected.image)
                putExtra(DetailActivity.EXTRA_NAME, shoesSelected.name)
                putExtra(DetailActivity.EXTRA_DETAIL, shoesSelected.detail)
                putExtra(DetailActivity.EXTRA_PRICE, shoesSelected.price)
            }
        startActivity(kedetail)
    }

    private fun showAbout(){
        val aboutIntent = Intent(this@MainActivity, About::class.java)
        startActivity(aboutIntent)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                showRecyclerList()
            }
            R.id.action_about -> {
                showAbout()
            }
        }
    }
}