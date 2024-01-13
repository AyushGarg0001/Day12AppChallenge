package com.example.day12challengeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonStart= findViewById<Button>(R.id.btnStart)

        buttonStart.setOnClickListener {
            intent= Intent(applicationContext, secondScreen::class.java)
            startActivity(intent)
        }
    }
}