package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val increaseBtn: Button = findViewById(R.id.increaseButton)
        val resetBtn : Button = findViewById(R.id.resetButton)
        val resultText: TextView = findViewById(R.id.resultText)

        increaseBtn.setOnClickListener() {
            resultText.setText("" + increaseCounter())
        }

        resetBtn.setOnClickListener(){
            counter=0
            resultText.setText(""+counter)
        }


    }

    fun increaseCounter(): Int {
        counter++
        return counter
    }

}