package com.example.ownyourshoes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_IMG = "extra_img"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PRICE = "extra_price"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val detailActivityimg: ImageView = findViewById(R.id.detail_img)
        val detailActivityname: TextView = findViewById(R.id.detail_name)
        val detailActivitydetail: TextView = findViewById(R.id.detail_detail)
        val detailActivityprice: TextView = findViewById(R.id.detail_price)

        val img = intent.getIntExtra(EXTRA_IMG,0) //Untuk menerima data photo dari mainActivity
        val name = intent.getStringExtra(EXTRA_NAME) //Untuk menerima data name dari mainActivity
        val detail = intent.getStringExtra(EXTRA_DETAIL) //Untuk menerima data detail dari mainActivity
        val price = intent.getStringExtra(EXTRA_PRICE) //Untuk menerima data price dari mainActivity

        Glide.with(this) //Untuk menampilkan gambar
            .load(img)
            .into(detailActivityimg)
        detailActivityname.text = name //Untuk menampilkan judul
        detailActivitydetail.text = detail //Untuk menampilkan detail
        detailActivityprice.text = price //Untuk menampilkan price
    }
}
