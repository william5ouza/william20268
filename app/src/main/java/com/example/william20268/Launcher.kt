package com.example.william20268

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class Launcher : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnmaps = findViewById<Button>(R.id.btn_maps)
        val btnShared = findViewById<Button>(R.id.btn_shared)
        btn_maps.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View): Unit {
                // Handler code here.
                val intent = Intent(this@Launcher, myMaps::class.java)
                startActivity(intent)
            }
        })
        btn_shared.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View): Unit {
                // Handler code here.
                val intent = Intent(this@Launcher, myPrefs::class.java)
                startActivity(intent)
            }
        })


        /*val url: String = "https://api.jcdecaux.com/vls/v1/stations?contract=dublin&apiKey=11eb674a4b9d0b0a5ddef706808e9f512a795334/"
          val recyclerView = my_recycler as RecyclerView
        recyclerView.layoutManager =LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


        val userlist = ArrayList<Dublin_Stations>()

            userlist.add(
                Dublin_Stations( "SMITHFIELD",
                53.349562, -6.278198)
            )
            userlist.add(
                Dublin_Stations("PARNELL SQUARE",
                53.349562, -6.278198)
            )
            userlist.add(
                Dublin_Stations("MATTER HOSPITAL",
                53.349562, -6.278198)
            )

        val adapter = OtherAdapter(userlist)

        //recyclerView.adapter = adapter
    }
    private fun getBikeStationJsonData(size: Int) {

        Log.d("","Loading JSON data")

        val url ="https://api.jcdecaux.com/vls/v1/stations?contract=dublin&apiKey=163597812dfb8e11bcdaa6297a730b46529a5bcd"

        Log.i(getString(R.string.DEBUG_MAINACTIVITY), url)

        //Create a request object

        val request = Request.Builder().url(url).build()

        //Create a client

        val client = OkHttpClient()

        val recyclerView = my_recycler as RecyclerView
        recyclerView.layoutManager =LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: java.io.IOException) {
                //   TODO("Not yet implemented")
                Log.i(getString(R.string.DEBUG_MAINACTIVITY), "JSON HTTP CALL FAILED")
            }

            override fun onResponse(call: Call, response: Response) {
                // TODO("Not yet implemented")
                Log.i(getString(R.string.DEBUG_MAINACTIVITY), "JSON HTTP CALL SUCCEEDED")

                val body = response.body?.string()
                //  println("json loading" + body)
                Log.i(getString(R.string.DEBUG_MAINACTIVITY), body)
                val jsonBody = "{\"stations\": " + body + "}"

                val gson = GsonBuilder().create()
                var userlist = gson.fromJson(jsonBody, StationDB::class.java).stations


                return
            }

        })
    }
    */
    }

    override fun onClick(v: View?) {

    }


}




