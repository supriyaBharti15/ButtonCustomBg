package com.example.buttoncustombg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

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

        /*
        1. Normal way to create button and button listener
         */
        var button = findViewById(R.id.buttonBg) as Button
        var intCol = 0
        button.setOnClickListener {
            button.background = getDrawable(bgDrawableIds[intCol % bgDrawableIds.size])
            intCol++;
        }

        /*
            Create a new Button programmatically in Kotlin Android.
         */
        addDynamicButton()

        /*
          Create a new EditText programmatically in Kotlin Android.
         */
        addDynamicEditText()

    }

    private fun addDynamicButton() {
        var dynamicButton = Button(this)
        dynamicButton.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        dynamicButton.setPadding(20, 20, 20, 20)
        dynamicButton.text = "Dynamic Button"
        dynamicButton.isAllCaps = false
        dynamicButton.background = getDrawable(R.drawable.btn_edge_color)
        mainLayout.addView(dynamicButton)
        dynamicButton.setOnClickListener {
            /*
            Write your code here
             */
            Toast.makeText(this, "My Dynamic button onClick", Toast.LENGTH_LONG).show()
        }

    }

    private fun addDynamicEditText() {
        val dynamicEditext = EditText(this)
        dynamicEditext.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        dynamicEditext.hint = "Enter Your Name"
        dynamicEditext.background = resources.getDrawable(R.drawable.btn_edge_color)
        dynamicEditext.isSingleLine = true
        dynamicEditext.inputType = InputType.TYPE_CLASS_NUMBER
        dynamicEditext.setPadding(20, 15, 20, 15)
        mainLayout.addView(dynamicEditext)

    }
}
