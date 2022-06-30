package com.demo.retrofithttpmethods

data class User(
    val id: String?,
    val username: String?,
    val password: String?,
    val email: String?,
    val first_name: String?,
    val last_name: String?,
    val birthday: String?)


data class UserResponse(val code: Int?, val meta: String?, val data: User?)