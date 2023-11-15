package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text


class MainActivity : AppCompatActivity(), CalculatorUI {
    val calculator = Calculator()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val calculatorFragment = CalculatorFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer, calculatorFragment)
            commit()
        }
    }
    override fun onButtonPress(symbol: String){
        val display = findViewById<TextView>(R.id.displayView)
        calculator.symbolInterpreter(symbol)
        display.text = calculator.numberEnteredAsString.toString()
    }




}