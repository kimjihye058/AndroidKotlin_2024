package com.example.andtest01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.findViewTreeViewModelStoreOwner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var txtName = findViewById<TextView>(R.id.txtName)
        var btnName = findViewById<TextView>(R.id.btnName)

        btnName.setOnClickListener{
            txtName.text = "미림"
        }
    }
}