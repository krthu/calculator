package com.example.calculator

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView


class CalculatorFragment : Fragment(R.layout.fragment_calculator) {
    var buttons = mutableListOf<Button>()
    lateinit var display: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        display = view.findViewById<TextView>(R.id.displayView)
        Log.d("!!!", "OnView")
        createButtonList(view)
        buttons.forEach{ button ->
            button.setOnClickListener{
                printInDisplay(button.text.toString())
            }
        }


    }

    fun printInDisplay(symbol: String){
        display.text = display.text.toString() + symbol
    }

    fun createButtonList(view: View){
        buttons.add(view.findViewById(R.id.button1))
        buttons.add(view.findViewById(R.id.button2))
        buttons.add(view.findViewById(R.id.button3))
        buttons.add(view.findViewById(R.id.button4))
        buttons.add(view.findViewById(R.id.button5))
        buttons.add(view.findViewById(R.id.button6))
        buttons.add(view.findViewById(R.id.button7))
        buttons.add(view.findViewById(R.id.button8))
        buttons.add(view.findViewById(R.id.button9))
        buttons.add(view.findViewById(R.id.button0))
    }



}