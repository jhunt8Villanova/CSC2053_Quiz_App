package com.example.csc2053_quiz_app_androidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var questionNo = 0
    var questions = listOf("1. What is the capital of Romania? \n\n A. Craiova\n\n B. Cluj-Napoca\n\n C. Bucharest",
            "2. What is the capital of Portugal? \n\n A. Lisbon \n\n B. Porto \n\n C. Faro",
            "3. What is the capital of Argentina? \n\n A) Buenos Aires \n\n B) Rosario \n\n C) Cordoba",
            "4. What is the capital of Canada? \n\n A) Toronto \n\n B) Ottawa \n\n C) Montreal",
            "5. What is the capital of Thailand? \n\n A) Changmai \n\n B) Pattaya City \n\n C) Bangkok",
            "6. What is the capital of Serbia? \n\n A) Novi Sad \n\n B) Belgrade \n\n C) Leskovac",
            "7. What is the capital of Nigeria? \n\n A) Lagos \n\n B) Kano \n\n C) Abuja",
            "8. What is the capital of Finland? \n\n A) Tampere \n\n B) Helsinki \n\n C) Turku",
            "9. What is the capital of Switzerland? \n\n A) Zurich \n\n B) Lucerne \n\n C) Bern",
            "10. What is the capital of Morocco? \n\n A) Rabat \n\n B) Casablanca \n\n C) Fes")
    var rightAnswers = listOf(3, 1, 1, 2, 3, 2, 3, 2, 3, 1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            showToast(1)
        }

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            showToast(2)
        }

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            showToast(3)
        }

    }

    fun showToast(answer: Int) {
        if (answer==rightAnswers.get(questionNo)) {
            Toast.makeText(applicationContext, "CORRECT!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(applicationContext, "WRONGO!", Toast.LENGTH_SHORT).show()
        }
    }
}