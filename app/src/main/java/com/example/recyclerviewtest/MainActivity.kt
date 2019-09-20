package com.example.recyclerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val TAG ="MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,TAG+" Hello world")

        val recyclerView:RecyclerView =findViewById(R.id.rcv)
        recyclerView.layoutManager =LinearLayoutManager(this, RecyclerView.VERTICAL,false)

        val albums = ArrayList<Album>()

        albums.add(Album("Arianna Grande",22,R.drawable.ic_launcher_background))
        albums.add(Album("Camila Cabello",12,R.drawable.ic_launcher_background))
        albums.add(Album("Eminem",11,R.drawable.ic_launcher_background))
        albums.add(Album("Bellonce",19,R.drawable.ic_launcher_background))

        val adapter = AdapterAlbum(albums)
        recyclerView.adapter =adapter


    }
}
