package com.example.myapplication.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.models.RequestModel

class RequestAdapter(private val context: Context, private val list: List<RequestModel>) :
    RecyclerView.Adapter<RequestAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.card_network_request, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val request = list[position]
        holder.name.text = request.username
        holder.headline.text = request.headline

        // Static UI logic only
        holder.connectOk.setOnClickListener {
            // Handle connect OK action here (static UI only)
        }

        holder.connectCancel.setOnClickListener {
            // Handle connect cancel action here (static UI only)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.item_text)
        val headline: TextView = itemView.findViewById(R.id.item_headline)
        val userImage: ImageView = itemView.findViewById(R.id.item_image)
        val connectOk: CardView = itemView.findViewById(R.id.connect_ok)
        val connectCancel: CardView = itemView.findViewById(R.id.connect_cancel)
    }
}
