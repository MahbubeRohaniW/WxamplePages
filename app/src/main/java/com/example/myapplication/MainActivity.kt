package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        persian_iran_font(this,navigation)

        scrollable.setOnScrollChangeListener()



        include1.setOnClickListener {

            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)


        }
    }

    fun persian_iran_font(context: Context, v: View) {
        try {
            if (v is ViewGroup) {
                val vg: ViewGroup = v as ViewGroup
                for (i in 0 until vg.getChildCount()) {
                    val child: View = vg.getChildAt(i)
                    persian_iran_font(context, child)
                }
            } else if (v is TextView) {
                (v as TextView).setTypeface(
                    Typeface.createFromAsset(
                        context.getAssets(),
                        "font/IRANYekanRegularMobile.ttf"
                    )
                )
            }
        } catch (e: Exception) {
        }
    }
}

private fun ScrollView.setOnScrollChangeListener() {
      fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
          onScrolled(recyclerView, dx, dy)
        if (dy > 0) {
            // Scroll Down
            if (floating_action_button.isShown()) {
                floating_action_button.hide()
            }
        } else if (dy < 0) {
            // Scroll Up
            if (!floating_action_button.isShown()) {
                floating_action_button.show()
            }
        }
    }
}
