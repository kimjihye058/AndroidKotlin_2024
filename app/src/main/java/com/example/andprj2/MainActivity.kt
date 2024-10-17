package com.example.andprj2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.andprj2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Btn.setOnClickListener {
            Toast.makeText(applicationContext, "본인 이름 출력", Toast.LENGTH_SHORT).show()
        }

        binding.checkBox.setOnCheckedChangeListener { compoundButton, b ->
            if (binding.checkBox.isChecked) binding.Btn.isEnabled = false
            else binding.Btn.isEnabled = true
        }
    }


}