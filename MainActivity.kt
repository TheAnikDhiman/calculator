package com.example.calculator_ad

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addition = findViewById<Button>(R.id.addition)
        val sub = findViewById<Button>(R.id.sub)
        val divide = findViewById<Button>(R.id.divide)
        val multi = findViewById<Button>(R.id.multi)
        val number1 = findViewById<EditText>(R.id.number1)
        val number2 = findViewById<EditText>(R.id.number2)


        addition.setOnClickListener {
            if (number1.text.toString() != " " && number2.text.toString() != " ") {
                val num1 = number1.text.toString().toInt()
                val num2 = number2.text.toString().toInt()
                val sum = num1 + num2
                Toast.makeText(applicationContext,"The Sum is $sum",Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(
                    applicationContext,
                    "Please Enter Required Field",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        sub.setOnClickListener {
            if (number1.text.toString() != " " && number2.text.toString() != " ") {
                val num1 = number1.text.toString().toInt()
                val num2 = number2.text.toString().toInt()
                val sub = num1 - num2
                Toast.makeText(applicationContext,"The Subtraction is $sub",Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(
                    applicationContext,
                    "Please Enter Required Field",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        divide.setOnClickListener {
            if (number1.text.toString() != " " && number2.text.toString() != " ") {
                val num1 = number1.text.toString().toInt()
                val num2 = number2.text.toString().toInt()
                if (num1!=0){
                val div = num1 / num2
                Toast.makeText(applicationContext,"The Division is $div",Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(applicationContext,"Not Difined",Toast.LENGTH_SHORT).show()
                }

            } else {
                Toast.makeText(
                    applicationContext,
                    "Please Enter Required Field",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        multi.setOnClickListener {
            if (number1.text.toString()!=" " && number2.text.toString() != " "){
                val num1= number1.text.toString().toInt()
                val num2= number2.text.toString().toInt()
                val product= num1*num2
                Toast.makeText(applicationContext,"The Multiplication is $product",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(applicationContext,"Please Enter Required Field", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
