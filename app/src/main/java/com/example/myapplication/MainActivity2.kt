package com.example.myapplication

import android.app.BackgroundServiceStartNotAllowedException
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    lateinit var start:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        start=findViewById(R.id.button)
        start.setOnClickListener({
            startActivity(Intent(this,MainActivity3::class.java))
        })
    }
}