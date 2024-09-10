package com.example.andtest02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_test4)
        var chk = findViewById<CheckBox>(R.id.chk)
        var linear = findViewById<LinearLayout>(R.id.linear)
        var rg = findViewById<RadioGroup>(R.id.rg)
        var btn = findViewById<Button>(R.id.btn)
        var imgMe = findViewById<ImageView>(R.id.imgMe)
        chk.setOnCheckedChangeListener { compoundButton, b ->
            if (chk.isChecked == true) linear.visibility = android.view.View.VISIBLE
            else {
                linear.visibility = android.view.View.INVISIBLE
                rg.clearCheck()
                chk.isChecked = false
                imgMe.setImageDrawable(null)
            }
        }
        btn.setOnClickListener {
            when(rg.checkedRadioButtonId) {
                R.id.christ -> imgMe.setImageResource(R.drawable.me1)
                R.id.shibuya -> imgMe.setImageResource(R.drawable.me3)
                R.id.vienna -> imgMe.setImageResource(R.drawable.me2)
                else -> Toast.makeText(applicationContext, "지혜먼저 선택하세요.", Toast.LENGTH_SHORT).show()

            }
        }
//        btnOK.setOnClickListener {
//            var name = edName.text
//            Toast.makeText(applicationContext, "입력한 이름 : " + name, Toast.LENGTH_SHORT).show()
//        }
    }
}