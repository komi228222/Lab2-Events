package com.example.attributes

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.edit_text)

        findViewById<Button>(R.id.btn_bg_red).setOnClickListener {
            editText.setBackgroundColor(Color.RED)
        }

        findViewById<Button>(R.id.btn_bg_green).setOnClickListener {
            editText.setBackgroundColor(Color.GREEN)
        }

        findViewById<Button>(R.id.btn_color_red).setOnClickListener {
            editText.setTextColor(Color.RED)
        }

        findViewById<Button>(R.id.btn_color_blue).setOnClickListener {
            editText.setTextColor(Color.BLUE)
        }

        findViewById<Button>(R.id.btn_size_big).setOnClickListener {
            editText.textSize = 32f
        }

        findViewById<Button>(R.id.btn_size_small).setOnClickListener {
            editText.textSize = 12f
        }
    }
}