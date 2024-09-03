package com.example.andtest02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn3 = findViewById<TextView>(R.id.btn3)

        btn3.setOnClickListener{
            btn3.visibility= View.INVISIBLE
        }
    }
}