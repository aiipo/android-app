package com.example.myapplication.ui.main

import android.os.Bundle
import android.widget.TextView
import com.example.myapplication.R
import com.example.myapplication.ui.base.BaseActivity

class MainActivity : BaseActivity<MainViewModel>(MainViewModel::class) {

    override val layoutId: Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = findViewById<TextView>(R.id.textView)

        viewModel.users.observe(this, {
            textView.text = it
        })
    }
}