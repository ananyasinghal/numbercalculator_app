package com.example.numbercalculator

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.numbercalculator.R.layout.activity_main

class MainActivity : AppCompatActivity() {
    private var num : String? = ""
    private var num1 : Float = 0.0F
    private var num2 : Float = 0.0F
    private var isaddition : Boolean = false
    private var issubtraction : Boolean = false
    private var isdivide : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)
    }
    fun operationfunction(view : View) {
        val edittext : EditText? = findViewById(R.id.edit_text)
         when (view.id) {
            R.id.button_one -> {
                num += "1"
                edittext?.setText(num)
            }

             R.id.button_two -> {
                 num += "2"
                 edittext?.setText(num)
             }

             R.id.button_three -> {
                 num += "3"
                 edittext?.setText(num)
             }

             R.id.button_four -> {
                 num += "4"
                 edittext?.setText(num)
             }

             R.id.button_five -> {
                 num += "5"
                 edittext?.setText(num)
             }

             R.id.button_six -> {
                 num += "6"
                 edittext?.setText(num)
             }

             R.id.button_seven -> {
                 num += "7"
                 edittext?.setText(num)
             }

             R.id.button_eight -> {
                 num += "8"
                 edittext?.setText(num)
             }

             R.id.button_nine -> {
                 num += "9"
                 edittext?.setText(num)
             }

            R.id.button_clear -> {
                num = ""
                edittext?.setText(num)
            }
            R.id.button_dot -> {
                num += "."
                edittext?.setText(num)
            }
            R.id.button_add -> {
                if (num.isNullOrBlank()) {
                    edittext?.setText("")
                } else {
                    num1 = num!!.toFloat()
                    edittext?.setText("")
                    isaddition = true
                    num = ""
                }

            }

             R.id.button_subtract -> {
                 if (num.isNullOrBlank()) {
                     edittext?.setText("")
                 } else {
                     num1 = num!!.toFloat()
                     edittext?.setText("")
                     issubtraction = true
                     num = ""
                 }
             }

             R.id.button_divide -> {
                 if(num.isNullOrBlank()){
                     edittext?.setText("")
                 }else{
                     num1 = num!!.toFloat()
                     edittext?.setText("")
                     isdivide = true
                     num = ""
                 }
             }
             R.id.button_equal -> {
                 when {
                     isaddition -> {
                         num2 = num!!.toFloat()
                         edittext?.setText((num1 + num2).toString())

                     }
                     isdivide -> {
                         num2 = num!!.toFloat()
                         edittext?.setText((num1 / num2).toString())
                     }
                     else -> {
                         num2 = num!!.toFloat()
                         edittext?.setText((num1 - num2).toString())
                     }
                 }
             }



         }


    }

}


