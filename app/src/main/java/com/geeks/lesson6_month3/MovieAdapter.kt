package com.geeks.lesson6_month3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MovieAdapter (private val movieList: ArrayList<Movie>) : RecyclerView.Adapter<MovieAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieAdapter.ViewHolder {
       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_movie,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MovieAdapter.ViewHolder, position: Int) {
        val currentItem = movieList[position]
        holder.rvImage.setImageResource(currentItem.ivMovie)
        holder.rvName.text = currentItem.tvMovie
    }

    override fun getItemCount(): Int {
    return movieList.size
    }
 class ViewHolder(itemView : View) : RecyclerView.ViewHolder (itemView){
     val rvImage : ImageView = itemView.findViewById(R.id.iv_movie)
     val rvName : TextView = itemView.findViewById(R.id.tv_movie)
 }
}