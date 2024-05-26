package com.geeks.lesson6_month3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var movieList: ArrayList<Movie>
    private lateinit var imageList:Array<Int>
    private lateinit var nameList:Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageList = arrayOf(
            R.drawable.chungking,
            R.drawable.inthemoodforlove,
            R.drawable.thegrandmaster,
            R.drawable.dejavu,
            R.drawable.the2046,
            R.drawable.fallenangels,
            R.drawable.happytogether,
            R.drawable.thehand,
            R.drawable.ashesoftime,
            R.drawable.ennio,
            R.drawable.astearsgoby,
            R.drawable.daysofbeingwild,
        )




        nameList = arrayOf(
            "Chungking Express 2020",
            "In the Mood for Love",
            "The GrandMaster",
            "Deja Vu",
            "2046",
            "Fallen Angels",
            "Happy Together",
            "The Hand",
            "Ashes of Time",
            "Ennio",
            "As Tears Go By",
            "Days of Being Wild"



        )
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        movieList = arrayListOf<Movie>()
        getMovie()

    }
    private fun getMovie(){
        for (i in imageList.indices){
            val movie = Movie(imageList[i], nameList[i])
            movieList.add(movie)
        }
        recyclerView.adapter = MovieAdapter(movieList)

    }
}