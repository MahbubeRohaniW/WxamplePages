package com.example.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import kotlinx.android.synthetic.main.home_item_recycler.view.*
import kotlinx.android.synthetic.main.other_img.view.*

class HomeImageAdapter(val home_list : List<String> ): RecyclerView.Adapter<HomeImageAdapter.RecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.other_img, parent, false)
        return RecyclerViewHolder(v)
    }

    override fun getItemCount(): Int = home_list.size


    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) = holder.OnBind(home_list[position])


    class RecyclerViewHolder(val item: View) :
        RecyclerView.ViewHolder(item) {
        fun OnBind(homelist: String) {

            for (name in homelist ){
                item.img_item.setImageResource(R.drawable.home)
            }

        }
    }
}
