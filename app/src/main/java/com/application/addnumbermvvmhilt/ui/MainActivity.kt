package com.application.addnumbermvvmhilt.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.application.addnumbermvvmhilt.R
import com.application.addnumbermvvmhilt.data.MyNumber
import com.application.addnumbermvvmhilt.databinding.ActivityMainBinding
import com.application.addnumbermvvmhilt.util.setVisible

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModels: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addBtn.setOnClickListener {
            val firstValue = binding.etFirstNumber.text.toString().toDouble()
            val secondValue = binding.etSecondNumber.text.toString().toDouble()

            val number = MyNumber(firstValue, secondValue)

            viewModels.add(number)
        }

        viewModels.result.observe(this, Observer {
            binding.tvResult.text = it.result.toString()
            binding.tvResult.setVisible(true)
        })
    }
}