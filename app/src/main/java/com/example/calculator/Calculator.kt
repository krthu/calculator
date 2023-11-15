package com.example.calculator

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Calculator() {
    var sumAsString = "0"
    var numberEnteredAsString = "0"
    var sign: String? = null

    fun symbolInterpreter(symbol: String){
        when (symbol){
            "1","2","3","4","5","6","7","8","9","0","." -> {digitPressed(symbol)}
            "C" -> {numberEnteredAsString = "0"}
            "+", "-", "*", "/" -> {signPress(symbol)}
            "=" -> {handleEquals()}
        }
    }

    fun digitPressed(digit: String){
        if (numberEnteredAsString == "0" && digit != "."){
            numberEnteredAsString = digit
        }else{
            numberEnteredAsString += digit
        }
    }

    fun signPress(symbol: String){
        if (sign == null){
            sign = symbol
        }else{
            when (sign){
                
            }
        }
    }

    fun handleEquals(){
        numberEnteredAsString = sumAsString
    }



}