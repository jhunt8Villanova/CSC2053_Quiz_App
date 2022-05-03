package com.example.csc2053_quiz_app_androidstudio

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EndScreen : AppCompatActivity() {
        var score: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_end)
        val intent = intent
        val numCorrect = intent.getIntExtra("score", 0)
        val numQuestions = intent.getIntExtra("numQuestions", 0)
        score = findViewById<View>(R.id.textView3) as TextView
        score!!.text = numCorrect.toString()+"/"+numQuestions.toString()

    }
}