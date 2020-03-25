package com.example.buttoncustombg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    /*
    de-clear all the drawable in int array..
     */
    val bgDrawableIds = intArrayOf(
        R.drawable.btn_center_gradient,
        R.drawable.btn_edge_color,
        R.drawable.btn_gradient,
        R.drawable.btn_solid_color
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnBackground = findViewById(R.id.buttonBg) as Button
        var bgColor: Int = 1

        var intCol: Int = 0
        btnBackground.setOnClickListener {
            btnBackground.background = getDrawable(bgDrawableIds[intCol % bgDrawableIds.size])
            intCol++;
        }

        /*
        2nd Sollution in a long way
         */
        btnBackground.setOnClickListener { v ->
            if (bgColor == 1) {
                btnBackground.background = resources.getDrawable(R.drawable.btn_center_gradient)
                bgColor = 2
            } else if (bgColor == 2) {
                btnBackground.background = resources.getDrawable(R.drawable.btn_edge_color)
                bgColor = 3
            } else if (bgColor == 3) {
                btnBackground.background = resources.getDrawable(R.drawable.btn_gradient)
                bgColor = 4
            } else if (bgColor == 4) {
                btnBackground.background = resources.getDrawable(R.drawable.btn_solid_color)
                bgColor = 1
            }
        }

    }
}
