package com.example.calculator

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider


interface CalculatorUI {
    fun onButtonPress(symbol: String)
}

class CalculatorFragment : Fragment(R.layout.fragment_calculator) {
    var buttons = mutableListOf<Button>()
    lateinit var display: TextView
    private var calculatorUI: CalculatorUI? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is CalculatorUI) {
            calculatorUI = context
        }
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        display = view.findViewById<TextView>(R.id.displayView)
        createButtonList(view)
        buttons.forEach{ button ->
            button.setOnClickListener{
                calculatorUI?.onButtonPress(button.text.toString())
            }
        }
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
        buttons.add(view.findViewById(R.id.buttonComma))
        buttons.add(view.findViewById(R.id.buttonClear))
        buttons.add(view.findViewById(R.id.buttonPlus))
        buttons.add(view.findViewById(R.id.buttonMinus))
        buttons.add(view.findViewById(R.id.buttonTimes))
        buttons.add(view.findViewById(R.id.buttonDivision))
        buttons.add(view.findViewById(R.id.buttonEquals))
    }

}