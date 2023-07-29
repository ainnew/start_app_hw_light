package com.example.start_app_hw_light

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var numberTextView: TextView
    private lateinit var generateButton: Button

    override fun onCreate(bublic2: Bundle?) {
        super.onCreate(bublic2)
        setContentView(R.layout.activity_main)

        numberTextView = findViewById(R.id.numberTextView)
        generateButton = findViewById(R.id.generateButton)

        generateButton.setOnClickListener {
            val randomNumber = generateRandomNumber()
            numberTextView.text = randomNumber.toString()
        }
    }

    private fun generateRandomNumber(): Int {
        return Random.nextInt(1, 101)
    }
}


