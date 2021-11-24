package com.example.sreda.ui.main

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.example.sreda.databinding.ActivityMainBinding
import com.example.sreda.ui.base.BaseActivity
import com.example.sreda.ui.calculator.CalculatorActivity
import com.example.sreda.ui.list.ListActivity

class MainActivity : BaseActivity<MainViewModel>(MainViewModel::class) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listButton: Button = binding.openListButton
        listButton.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }

        val calculatorButton: Button = binding.openCalculator
        calculatorButton.setOnClickListener {
            val intent = Intent(this, CalculatorActivity::class.java)
            startActivity(intent)
        }
    }
}

