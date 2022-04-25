package com.example.csc2053_quiz_app_androidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            showToast()
        }
        button.setOnClickListener {
            Toast.makeText(applicationContext,"CORRECT!",Toast.LENGTH_SHORT).show()
        }

        button2.setOnClickListener {
            Toast.makeText(applicationContext, "INCORRECT!", Toast.LENGTH_SHORT).show()
        }

        button3.setOnClickListener {
            Toast.makeText(applicationContext, "WRONGO!", Toast.LENGTH_SHORT).show()
        }

    }
    fun showToast() {
        Toast.makeText(applicationContext,"CORRECT!", Toast.LENGTH_SHORT).show()
    }
}