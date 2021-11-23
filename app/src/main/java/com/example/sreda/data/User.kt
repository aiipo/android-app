package com.example.sreda.data

import com.google.gson.annotations.SerializedName

/**
 * @author s.timirov
 */
data class User(
    @SerializedName("id")
    val id: Long,
    @SerializedName("email")
    val email: String,
    @SerializedName("first_name")
    val firstName: String,
    @SerializedName("last_name")
    val lastName: String,
    @SerializedName("avatar")
    val avatarUrl: String,
)
