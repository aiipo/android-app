package com.example.myapplication.ui.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.myapplication.ui.api.RetrofitProvider
import com.example.myapplication.ui.data.Response
import com.example.myapplication.ui.data.User
import com.example.myapplication.ui.ui.base.BaseViewModel
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import retrofit2.Call
import retrofit2.Callback

class MainViewModel(val userList: Any) : BaseViewModel()