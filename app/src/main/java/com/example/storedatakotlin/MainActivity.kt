package com.example.storedatakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreferences = this.getSharedPreferences("com.example.storedatakotlin", android.content.Context.MODE_PRIVATE)

        val age = 30

//        sharedPreferences.edit().putInt("userAge", age).apply()

        val storedAge = sharedPreferences.getInt("userAge", 0)

        println("stored age: $storedAge")

        age = 31

//        sharedPreferences.edit().putInt("userAge", age).apply()

        val storedAge2 = sharedPreferences.getInt("userAge", 0)

        println("stored age 2: $storedAge2")

//        sharedPreferences.edit().remove("userAge").apply()

        val storedAge3 = sharedPreferences.getInt("userAge", 0)

        println("stored age 3: $storedAge3")


    }
}