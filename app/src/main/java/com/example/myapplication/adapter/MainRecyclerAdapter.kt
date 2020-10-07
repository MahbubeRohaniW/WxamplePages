package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import kotlinx.android.synthetic.main.home_item_recycler.view.*

class MainRecyclerAdapter  (val property : List<String> ): RecyclerView.Adapter<MainRecyclerAdapter.RecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.home_item_recycler, parent, false)
        return RecyclerViewHolder(v)
    }

    override fun getItemCount(): Int = property.size


    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) = holder.OnBind(property[position])


    class RecyclerViewHolder(val item: View) :
        RecyclerView.ViewHolder(item) {
        fun OnBind(nav_items: String) {

            item.home_property.text = nav_items

        }
    }
}

