package com.example.myapplication.ui.ui.list

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.ui.ui.base.BaseActivity
import java.lang.NumberFormatException
import android.util.Log

class ListActivity : BaseActivity<ListViewModel>(ListViewModel::class) {

    override val layoutId: Int = R.layout.activity_list

    private val loadButton: Button by lazy { findViewById<Button>(R.id.load_button) }
    private val editText: EditText by lazy { findViewById(R.id.load_text) }
    private val userRecyclerView: RecyclerView by lazy { findViewById(R.id.usersRecycleView) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadButton.setOnClickListener { onLoadButtonClick() }
        // userRecyclerView.adapter = создать свой адаптер
        viewModel.userList.observe {
            Toast.makeText(this, it.size.toString(), Toast.LENGTH_LONG).show()
            // Домашка: отрисовать список пользователей
        }
    }

    private fun onLoadButtonClick() {
        try {
            val page = editText.text.toString().toInt()
            viewModel.loadUsers(page)
        } catch (e: NumberFormatException) {

        }
    }
}