package com.example.myapplication.ui.ui.list

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.myapplication.ui.api.RetrofitProvider
import com.example.myapplication.ui.data.Response
import com.example.myapplication.ui.data.User
import com.example.myapplication.ui.ui.base.BaseViewModel
import retrofit2.Call
import retrofit2.Callback

class ListViewModel : BaseViewModel() {
    private val _userList: MutableLiveData<List<User>> = MutableLiveData()
    val userList: LiveData<List<User>> = _userList

    fun loadUsers(page: Int) {
        RetrofitProvider.userService.getUsers(page)
            .enqueue(object : Callback<Response> {
                override fun onResponse(
                    call: Call<Response>,
                    response: retrofit2.Response<Response>
                ) {
                    Log.d("TAG", "message")
                    Log.d("TAG", page.toString())
                    Log.d("TAG", "message")
                    Log.d("TAG", response.toString())
                    response.body()?.let { body->
                        _userList.postValue(body.users)
                    }
                }

                override fun onFailure(call: Call<Response>, t: Throwable) = Unit
            })
    }

    private fun subscribe() {
        viewModel.userList.observe {

        }
    }

}