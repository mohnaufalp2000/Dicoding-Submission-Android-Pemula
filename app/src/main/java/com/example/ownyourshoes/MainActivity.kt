package com.example.ownyourshoes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

}