package com.example.ownyourshoes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListAdapter(private val listAdapterShoes: ArrayList<Shoes>) : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var adapterName: TextView = itemView.findViewById(R.id.ls_name_shoes)
        var adapterDetail: TextView = itemView.findViewById(R.id.ls_detail_shoes)
        var adapterImg: ImageView = itemView.findViewById(R.id.ls_img_shoes)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Shoes)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_shoes, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listAdapterShoes.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val bind: Shoes = listAdapterShoes[position]
        Glide.with(holder.itemView.context)
            .load(bind.image)
            .apply(RequestOptions().override(55, 55))
            .into(holder.adapterImg)
        holder.adapterName.text = bind.name
        holder.adapterDetail.text = bind.detail

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listAdapterShoes[holder.adapterPosition]) }
    }
}