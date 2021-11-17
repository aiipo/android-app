package com.example.myapplication.ui.ui.main

import android.os.Bundle
import android.widget.TextView
import com.example.myapplication.R
import com.example.myapplication.ui.ui.base.BaseActivity
import android.content.Intent

import android.view.View
import android.widget.Button
import com.example.myapplication.ui.ui.list.ListActivity

class MainActivity : BaseActivity<MainViewModel>(MainViewModel::class) {

    override val layoutId: Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val button: Button = findViewById(R.id.button2)

        button.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }

//        viewModel.userList.observe {
//            findViewById<TextView>(R.id.textView).text = it.toString()
//        }
    }

//    fun goToAnotherActivity(view: View?) {
//        val intent = Intent(this, ListActivity::class.java)
//        startActivity(intent)
//    }
}