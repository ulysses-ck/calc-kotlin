package com.ulysses.calculadora

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit private var numOne: EditText
    lateinit private var numTwo: EditText
    lateinit private var result: TextView

    lateinit private var btnAdd: TextView
    lateinit private var btnMinus: TextView
    lateinit private var btnMultiply: TextView
    lateinit private var btnDivide: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        numOne = findViewById(R.id.numOne)
        numTwo = findViewById(R.id.numTwo)
        result = findViewById(R.id.result)

        btnAdd = findViewById(R.id.btnAdd)
        btnMinus = findViewById(R.id.btnMinus)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnDivide = findViewById(R.id.btnDivide)

        btnAdd.setOnClickListener() {

            result.text = (numOne.text.toString().toInt() + numTwo.text.toString().toInt()).toString()
        }

        btnMinus.setOnClickListener() {
            result.text = (numOne.text.toString().toInt() - numTwo.text.toString().toInt()).toString()
        }

        btnMultiply.setOnClickListener() {
            result.text = (numOne.text.toString().toInt() * numTwo.text.toString().toInt()).toString()
        }

        btnDivide.setOnClickListener() {
            result.text = (numOne.text.toString().toInt() / numTwo.text.toString().toInt()).toString()
        }
    }
}