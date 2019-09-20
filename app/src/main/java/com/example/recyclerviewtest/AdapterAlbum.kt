package com.example.recyclerviewtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class AdapterAlbum(var list:AbstractList<Album>): RecyclerView.Adapter<AdapterAlbum.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.content_item,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
      return list.size
    }

    override fun onBindViewHolder(holder: AdapterAlbum.ViewHolder, position: Int) {
       holder.bindItems(list[position])
    }

    class ViewHolder(view:View) :RecyclerView.ViewHolder(view){

        fun bindItems(data:Album){
            val title:TextView =itemView.findViewById(R.id.txtTitle)
            val count:TextView= itemView.findViewById(R.id.txtCount)
            val thumbnail:ImageView =itemView.findViewById(R.id.thumbnail)

            title.text =data.name;
            count.text =data.numOfSong.toString()

           itemView.setOnClickListener {
               Toast.makeText(itemView.context,"Album de ${data.name}",Toast.LENGTH_LONG).show()
           }
        }


    }
}

