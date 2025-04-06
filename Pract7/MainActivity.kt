package com.example.practical1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    lateinit var toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "Kotlin App"


        val btn = findViewById<Button>(R.id.btnClicked)
        btn.setOnClickListener{
            val text = findViewById<TextView>(R.id.textView)
            text.text = "Button Clicked!"
        }
    }

}