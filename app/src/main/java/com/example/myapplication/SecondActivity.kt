package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import com.example.myapplication.adapter.HomeImageAdapter
import com.example.myapplication.adapter.MainRecyclerAdapter
import kotlinx.android.synthetic.main.second_page_footer.*


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_page_activity)

    val propertyList = ArrayList<String> ()
    propertyList.add("آسانسور")
    propertyList.add("بالکن")
    propertyList.add("تهویه مطبوع")
    propertyList.add("گاز صفحه ای")
    propertyList.add("شوتینگ")
    propertyList.add("آنتن مرکزی")
    propertyList.add("استخر")
    propertyList.add("جکوزی")
    propertyList.add("سونا")


   val adapter = MainRecyclerAdapter(propertyList)

    recycler_property.adapter = adapter
        recycler_property.setHasFixedSize(true)
        recycler_property.setItemAnimator(DefaultItemAnimator())
        //-----------------

        val ImageList = ArrayList<String> ()
        ImageList.add("img1")
        ImageList.add("img2")
        ImageList.add("img3")
        ImageList.add("img4")
        ImageList.add("img5")


        val HomeImgAdapter = HomeImageAdapter(ImageList)
        img_home.adapter = HomeImgAdapter
    }


}