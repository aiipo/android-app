package com.example.myapplication.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.myapplication.ui.base.BaseViewModel

class MainViewModel : BaseViewModel() {

    private val _users: MutableLiveData<String> = MutableLiveData()
    val users: LiveData<String> = _users

    init {
        val thread = Thread {
            Thread.sleep(3000)
            _users.postValue("Goodbye Hell!")
        }
    }
}