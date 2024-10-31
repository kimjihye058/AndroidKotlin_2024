package com.example.and_grid

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.and_grid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        binding.btnLogin.setOnClickListener { 
            var id = "아이디: " + binding.edtID.text.toString()
            var pw = "\n비밀번호: " + binding.edtPW.text.toString()
            Toast.makeText(applicationContext, id+pw, Toast.LENGTH_SHORT).show()
        }
        binding.btnCancel.setOnClickListener {
            binding.edtID.setText("")
            binding.edtPW.setText("")
        }
    }
}
