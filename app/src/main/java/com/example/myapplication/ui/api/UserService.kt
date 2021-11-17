package com.example.myapplication.ui.api

import com.example.myapplication.ui.data.Response
import retrofit2.Call
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface UserService {

    @GET("api/users?page=2")
    fun getUsers(@Query("page") page: Int): Call<Response>
}