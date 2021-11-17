package com.example.myapplication.ui.api

import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitProvider {
    val userService: UserService by lazy { retrofit.create(UserService::class.java) }

    val retrofit: Retrofit by lazy { createRetroft() }

    private fun createRetroft(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https:/reqres.in/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}
