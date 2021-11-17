package com.example.myapplication.ui.data

import com.google.gson.annotations.SerializedName

class Response(
    @SerializedName("data")
    val users: List<User>
)