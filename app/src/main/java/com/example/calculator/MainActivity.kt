package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var etNum1: EditText?= null //on the activity etNum1
    private var etNum2 : EditText? = null // on the activity etNum2
    private var tvDisplay: TextView? = null // on the activity tvDis

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNum1 = findViewById<EditText>(R.id.etNum1)
        etNum2 = findViewById<EditText>(R.id.etNum2)
        tvDisplay = findViewById<TextView>(R.id.tvDisplay)

        val btnAddition = findViewById<Button>(R.id.btnAdd)
        btnAddition.secOnClickListerner{
            add()
        }
        val btnSubtraction = findViewById<Button>(R.id.btnAdd)
        btnSubtraction.setOnClickListerner{
            sub()
        }
        val btnMultiplication = findViewById<Button>(R.id.btnAdd)
        btnMultiplication.setOnClickListerner{
            mul()
        }
        val btnDivision = findViewById<Button>(R.id.btnAdd)
        btnDivision.setOnClickListerner{
            div()
        }

        val btnAddition = findViewById<Button>(R.id.btnAdd)
        val btnSubtraction = findViewById<Button>(R.id.btnSub)
        val btnMultiplication = findViewById<Button>(R.id.btnMul)
        val btnDivision = findViewById<Button>(R.id.btnDiv)
    }

    private fun add(){
        var intNum1: Int = 0
        var intNum2 : Int = 0
        var intAns: Int = 0

        intNum1 = etNum1.text.toString().toInt()
        intNum1 = etNum1.text.toString().toInt()

        intAns= intNum1 + intNum2


    }
}
