package com.example.jlazaro.acmworkshop

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class QuizActivity : AppCompatActivity() {
    private var scoreView : TextView? = null
    private var questionView : TextView? = null
    private var buttonA : Button? = null
    private var buttonB : Button? = null
    private var buttonC : Button? = null

    private var answer : String? = null
    private var score = 0
    private var questionNumber = 0

    private val MAX_SCORE = 3
    private var attempts = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        scoreView = findViewById<TextView>(R.id.actual_score) as TextView
        //questionView = findViewById<TextView>(R.id.question) as TextView
        buttonA = findViewById<Button>(R.id.button_a) as Button
        buttonB = findViewById<Button>(R.id.button_a) as Button
        buttonC = findViewById<Button>(R.id.button_a) as Button

        buttonA?.setOnClickListener{
            Toast.makeText(this@QuizActivity, "Hello There", Toast.LENGTH_SHORT).show()
        }
    }
}
