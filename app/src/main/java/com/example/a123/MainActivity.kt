package com.example.a123

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val button = findViewById<Button>(R.id.botao_soma)
        button.setOnClickListener {
            val n1 = findViewById<EditText>(R.id.n1).text.toString().toInt()
            val n2 = findViewById<EditText>(R.id.n2).text.toString().toInt()

            val resultado = n1+n2
            val avisotoast = resultado.toString()

            Toast.makeText(this,avisotoast,Toast.LENGTH_SHORT).show()
        }

        val sub = findViewById<Button>(R.id.botao_subtracao)
        sub.setOnClickListener {
            val n1 = findViewById<EditText>(R.id.n1).text.toString().toInt()
            val n2 = findViewById<EditText>(R.id.n2).text.toString().toInt()

            val resultado = n1-n2
            val avisotoast = resultado.toString()

            Toast.makeText(this,avisotoast,Toast.LENGTH_SHORT).show()
        }

        val mul = findViewById<Button>(R.id.botao_multiplicacao)
        mul.setOnClickListener {
            val n1 = findViewById<EditText>(R.id.n1).text.toString().toInt()
            val n2 = findViewById<EditText>(R.id.n2).text.toString().toInt()

            val resultado = n1*n2
            val avisotoast = resultado.toString()

            Toast.makeText(this,avisotoast,Toast.LENGTH_SHORT).show()
        }

        val div = findViewById<Button>(R.id.botao_divisao)
        div.setOnClickListener {
            val n1 = findViewById<EditText>(R.id.n1).text.toString().toInt()
            val n2 = findViewById<EditText>(R.id.n2).text.toString().toInt()

            val resultado = n1/n2
            val avisotoast = resultado.toString()

            Toast.makeText(this,avisotoast,Toast.LENGTH_SHORT).show()
        }

    }
}
