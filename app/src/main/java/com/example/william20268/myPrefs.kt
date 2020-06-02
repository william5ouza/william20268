package com.example.william20268

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.william20268.Adapters.OtherAdapter
import com.example.william20268.models.Position

import kotlinx.android.synthetic.main.activity_main.*


class myPrefs : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_stations)
        var bikelist: List<Position>


    }

    private fun generateStationsList(size: Int): List<Position> {

        val recyclerView = my_recycler as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        //val list = ArrayList<>()
        val userlist = ArrayList<Position>()
        for (i in 0 until size) {
            val drawable = when (i % 3) {
                0 -> R.drawable.ic_location
                1 -> R.drawable.ic_location
                else -> R.drawable.ic_location
            }
            val item = Position("", 53.349562, -6.278198)
            userlist += item

            val adapter = OtherAdapter(userlist)

            recyclerView.adapter = adapter
        }
        return userlist
    }


}