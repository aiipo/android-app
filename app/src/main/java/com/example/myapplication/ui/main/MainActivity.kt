package com.example.myapplication.ui.main

import android.os.Bundle
import android.widget.TextView
import com.example.myapplication.R
import com.example.myapplication.ui.base.BaseActivity
import android.content.Intent

import android.view.View
import com.example.myapplication.ui.list.ListActivity


class MainActivity : BaseActivity<MainViewModel>(MainViewModel::class) {

    override val layoutId: Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    fun goToAnotherActivity(view: View?) {
        val intent = Intent(this, ListActivity::class.java)
        startActivity(intent)
    }
}