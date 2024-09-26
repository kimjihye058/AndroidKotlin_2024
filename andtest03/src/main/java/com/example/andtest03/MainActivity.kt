package com.example.and_test03

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.andtest03.R
import com.example.andtest03.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.chk.setOnCheckedChangeListener { compoundButton, b ->
            if(binding.chk.isChecked == true) binding.linear.visibility = android.view.View.VISIBLE
            else {
                binding.linear.visibility = android.view.View.INVISIBLE
                binding.rg.clearCheck()
                binding.chk.isChecked = false
            }
        }
        binding.resBtn.setOnClickListener{
            var num1 = binding.edit1.text.toString()
            var num2 = binding.edit2.text.toString()
            var res:String = ""
            when(binding.rg.checkedRadioButtonId){
                R.id.plus -> res = (Integer.parseInt(num1) + Integer.parseInt(num2)).toString()
                R.id.minus -> res = (Integer.parseInt(num1) - Integer.parseInt(num2)).toString()
                R.id.mul -> res = (Integer.parseInt(num1) * Integer.parseInt(num2)).toString()
                R.id.div -> res = (Integer.parseInt(num1) / Integer.parseInt(num2)).toString()
            }
            binding.resText.text = "계산결과 : " + res
        }
    }
}