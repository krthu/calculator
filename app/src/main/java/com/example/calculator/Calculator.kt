package com.example.calculator

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Calculator() {
    var totalAsString = "0"
    var numberEnteredAsString: String? = "0"
    var sign: String? = null

    fun symbolInterpreter(symbol: String){
        when (symbol){
            "1","2","3","4","5","6","7","8","9","0","." -> {digitPressed(symbol)}
            "C" -> {
                numberEnteredAsString = "0"
                totalAsString = "0"
            }
            "+", "-", "*", "/" -> {signPress(symbol)}
            "=" -> {handleEquals()}
        }
    }

    fun digitPressed(digit: String){
        if (numberEnteredAsString == "0" && digit != "." || numberEnteredAsString == null){
            numberEnteredAsString = digit
        }else{
            numberEnteredAsString += digit
        }
    }

    fun signPress(symbol: String){
        if (sign == null){
            sign = symbol
            totalAsString = numberEnteredAsString.toString()
            numberEnteredAsString = null
        }else{
            handleEquals()
            sign = null
        }
    }

    fun handleEquals(){
        var sum = 0.0
        val total = totalAsString.toDouble()
        val numberEntered = (numberEnteredAsString?.toDouble() ?: 0.0)
        when (sign){
            "+" -> {
                sum =  total + numberEntered
            }
            "-" -> {
                sum =  total - numberEntered
            }
            "*" -> {
                sum =  total * numberEntered
            }
            "/" -> {
                sum =  total / numberEntered
            }
        }

        totalAsString = sum.toString()
        numberEnteredAsString = null
    }



}