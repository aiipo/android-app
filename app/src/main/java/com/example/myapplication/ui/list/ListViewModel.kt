package com.example.myapplication.ui.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.myapplication.ui.base.BaseViewModel

class ListViewModel : BaseViewModel() {
    private val _users: MutableLiveData<String> = MutableLiveData()
    val users: LiveData<String> = _users
}