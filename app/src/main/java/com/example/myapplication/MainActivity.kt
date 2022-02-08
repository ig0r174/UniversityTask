package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = findViewById<TextView>(R.id.textView)
        view.text = "Ваш текст"

        val student = Student(name = "Александр", course = 1)
        print(student.name)
        print(student.toString())

        setContentView(R.layout.activity_main)
    }
}