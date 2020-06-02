package com.example.william20268.Adapters

import android.content.Context
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.william20268.R
import kotlinx.android.synthetic.main.list_stations.*

class StationActivity : AppCompatActivity() {

    lateinit var btnSave: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list_stations)

        val intent = intent
        var stationLatitude = intent.getStringExtra("lat")
        var stationLongitude = intent.getStringExtra("lng")
        var stationId = intent.getStringExtra("id")


        btnSave.setOnClickListener {
            // create shared preferences file
            val pref = getPreferences(Context.MODE_PRIVATE)
            val editor = pref.edit()


            editor.putString("Station", tv_address.text.toString())
            editor.putString("Position", tv_lat.text.toString())
            editor.putString("Position", tv_lng.text.toString())
            editor.apply()

            val toast = Toast.makeText(applicationContext, "Station Saved", Toast.LENGTH_LONG)
            toast.setGravity(Gravity.TOP, 0, 140)
            toast.show()
        }

//
    }


}