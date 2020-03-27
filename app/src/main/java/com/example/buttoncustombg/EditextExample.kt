package com.example.buttoncustombg

import android.os.Bundle
import android.text.Editable
import android.text.InputType
import android.text.TextWatcher
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.marginTop
import kotlinx.android.synthetic.main.edittext_example.*

class EditextExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edittext_example)
        createDynamicEditext()
    }

    /*
    * Create a new EditText Widget programmatically in Android using Kotlin
    * */
    private fun createDynamicEditext() {
        var dynamicEditext = EditText(this)
        dynamicEditext.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT)
        dynamicEditext.hint="Dynamic EdiText..."
        dynamicEditext.isSingleLine=true
        dynamicEditext.inputType=InputType.TYPE_CLASS_NUMBER
        dynamicEditext.imeOptions = EditorInfo.IME_ACTION_DONE
        linearLayout.addView(dynamicEditext)


        /*
        Apply text change listener
         */
        dynamicEditext.addTextChangedListener(object :TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                //TODO("Not yet implemented")
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                //TODO("Not yet implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                //Write your code here
            }

        })
    }
}