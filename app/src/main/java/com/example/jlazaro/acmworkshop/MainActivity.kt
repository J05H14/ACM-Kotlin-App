package com.example.jlazaro.acmworkshop

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var totalScore = findViewById<TextView>(R.id.total_score) as TextView
        var startButton=findViewById<Button>(R.id.start_button) as Button
        startButton.setOnClickListener{

        }
    }
}
