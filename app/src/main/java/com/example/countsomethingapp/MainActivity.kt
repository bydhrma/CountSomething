package com.example.countsomethingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtCount = findViewById<TextView>(R.id.textView1)
        var timesCount = 0
        val btnCount = findViewById<Button>(R.id.button1)
        val btnClear = findViewById<Button>(R.id.button2)

    //  count button
        btnCount.setOnClickListener {
            timesCount += 1

            txtCount.text = timesCount.toString()
        }

    //  clear button
        btnClear.setOnClickListener {
            timesCount = 0

            txtCount.text = timesCount.toString()
        }

    //test new

    }
}