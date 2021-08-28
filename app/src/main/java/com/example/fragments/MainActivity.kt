package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        val btnFragmentOne:Button  = findViewById(R.id.btnFragment1)
        val btnFragmentTwo:Button = findViewById(R.id.btnFragment2)

        // initial fragment on frame layout
        // supportFragmentManager help to set a fragment on frame layout
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,firstFragment)
            commit()
        }


        // change fragment using button
        btnFragmentOne.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment,firstFragment)
                commit()
            }
        }
        btnFragmentTwo.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment,secondFragment)
                commit()
            }
        }

    }
}