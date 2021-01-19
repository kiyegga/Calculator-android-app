package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
     var number: String = ""
     var numberOne = 0.0F
    var isAddition: Boolean = false
    var numberTwo = 0.0F
    var isDivide: Boolean = false
    var isMultiply: Boolean = false
    var isMinus: Boolean = false
    var isPercentage: Boolean = false
    var leftBracket: String = ""
    var rightBracket: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @SuppressLint("SetTextI18n")
    fun OperationFunction(view: View) {
        var editText: EditText? = findViewById(R.id.edit_text)
        when(view.id){
            R.id.button_one ->{
                //number = number + "1"
                number += "1"
                editText?.setText(number)
            }
            R.id.button_two -> {
                    number += "2"
                    editText?.setText(number)
            }
            R.id.button_three -> {
                number += "3"
                editText?.setText(number)
            }
            R.id.button_four -> {
                number += "4"
                editText?.setText(number)
            }
            R.id.button_five -> {
                number += "5"
                editText?.setText(number)
            }
            R.id.button_six -> {
                number += "6"
                editText?.setText(number)
            }
            R.id.button_seven -> {
                number += "7"
                editText?.setText(number)
            }
            R.id.button_eight -> {
                number += "8"
                editText?.setText(number)
            }
            R.id.button_nine -> {
                number += "9"
                editText?.setText(number)
            }
            R.id.button_zero -> {
                number += "0"
                editText?.setText(number)
            }
            R.id.button_rightBracket -> {
                rightBracket = ")"
                editText?.setText(rightBracket)
            }
            R.id.button_leftBracket -> {
                leftBracket = "("
                editText?.setText(leftBracket)
            }
            R.id.button_clear ->{
                number  = ""
                editText?.setText(number)
            }
            R.id.button_dot -> {
                number += "."
                editText?.setText(number)
            }
            R.id.button_plus ->{
                if(number.isNullOrBlank()){
                    editText?.setText("")
                }else{
                    numberOne = number.toFloat()
                    numberTwo
                  editText?.setText("")
                    //editText?.setText(this.numberOne.toString()+ " + "+ number.toString())
                    isAddition = true
                    number = ""

                }
            }
            R.id.button_divide -> {
                if(number.isNullOrBlank()){
                    editText?.setText("")
                }else{
                    numberOne = number.toFloat()
                    editText?.setText("")
                   // editText?.setText(this.numberOne.toString()+ " / "+number)
                    isDivide = true
                    number = ""
                }
            }
            R.id.button_minus -> {
                if(number.isNullOrBlank()){
                    editText?.setText("")
                }else{
                    numberOne = number.toFloat()
                    editText?.setText("")
                    //editText?.setText(numberOne.toString()+ " - ")
                   // editText?.setText(this.numberOne.toString()+ " - "+number)
                    isMinus = true
                    number = ""
                }
            }
            R.id.button_multiply -> {
                if(number.isNullOrBlank()){
                    editText?.setText("")
                }else{
                    numberOne = number.toFloat()
                    editText?.setText("")
                    //editText?.setText(this.numberOne.toString()+ " * "+number)
                    isMultiply = true
                    number = ""
                }
            }
            R.id.button_percentage -> {
                if (number.isNullOrBlank()){
                    editText?.setText("")
                }else{
                    numberOne = number.toFloat()
                    editText?.setText((numberOne/100).toString())
                    isPercentage = true
                    number = ""
                }
            }
            R.id.button_equal ->{
                if(isAddition == true){
                    numberTwo = number.toFloat()
                    editText?.setText((numberTwo+numberOne).toString())
                    number = ""
                }else if(isDivide){
                    numberTwo = number.toFloat()
                    editText?.setText((numberOne/numberTwo).toString())
                    number = ""
                }else if(isMinus == true){
                    numberTwo = number.toFloat()
                    editText?.setText((numberOne-numberTwo).toString())
                    number = ""
                }else if(isMultiply){
                    numberTwo = number.toFloat()
                    editText?.setText((numberOne*numberTwo).toString())
                    number = ""
                }else if (isPercentage){
                    numberOne = number.toFloat()
                     editText?.setText((numberTwo/100).toString())
                    number = ""
                }
            }
        }
    }
}