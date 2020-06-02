package com.example.william20268.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.william20268.R
import com.example.william20268.models.Position

class OtherAdapter(val userList: ArrayList<Position>) :
    RecyclerView.Adapter<OtherAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OtherAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_stations, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: OtherAdapter.ViewHolder, position: Int) {
        holder.bindItems(userList[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return userList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(user: Position) {
            val address = itemView.findViewById(R.id.tv_address) as TextView
            val lat = itemView.findViewById(R.id.tv_lat) as TextView
            val Lng = itemView.findViewById(R.id.tv_lng) as TextView
            address.text = user.address
            lat.text = user.lat.toString()
            Lng.text = user.lng.toString()
        }
    }
}