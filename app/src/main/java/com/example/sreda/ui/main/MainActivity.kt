package com.example.sreda.ui.main

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.example.sreda.R
import com.example.sreda.databinding.ActivityMainBinding
import com.example.sreda.ui.base.BaseActivity
import com.example.sreda.ui.list.ListActivity

class MainActivity : BaseActivity<MainViewModel>(MainViewModel::class) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val button: Button = binding.openListButton
        button.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }
    }
}

