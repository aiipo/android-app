package com.example.myapplication.ui.list

import android.os.Bundle
import com.example.myapplication.R
import com.example.myapplication.ui.base.BaseActivity

class ListActivity : BaseActivity<ListViewModel>(ListViewModel::class) {

    override val layoutId: Int = R.layout.activity_list

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}