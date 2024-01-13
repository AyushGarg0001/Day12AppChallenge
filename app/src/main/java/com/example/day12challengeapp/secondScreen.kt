package com.example.day12challengeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class secondScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)

        val cardAndroidWebDevelopment= findViewById<CardView>(R.id.cardAndroid)
        val cardWebDevelopment= findViewById<CardView>(R.id.cardWeb)
        val cardIOSDevelopment= findViewById<CardView>(R.id.cardIOS)
        val cardMLDevelopment= findViewById<CardView>(R.id.cardML)
        val cardBlockChainDevelopment= findViewById<CardView>(R.id.cardBlockChain)


        cardAndroidWebDevelopment.setOnClickListener{
            intent= Intent(applicationContext, ScreenAndroid::class.java)
            startActivity(intent)
        }

        cardWebDevelopment.setOnClickListener{
            intent= Intent(applicationContext, screenWEb::class.java)
            startActivity(intent)
        }

        cardIOSDevelopment.setOnClickListener{
            intent= Intent(applicationContext, screenIOS::class.java)
            startActivity(intent)
        }

        cardMLDevelopment.setOnClickListener{
            intent= Intent(applicationContext, screenML::class.java)
            startActivity(intent)
        }

        cardBlockChainDevelopment.setOnClickListener{
            intent= Intent(applicationContext, ScreenBlockChain::class.java)
            startActivity(intent)
        }
    }
}