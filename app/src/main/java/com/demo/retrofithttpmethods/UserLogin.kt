package com.demo.retrofithttpmethods

data class UserLogin(
    val id: String?,
    val username: String?,
    val password: String?
)

data class UserLoginResponse(val code: Int?, val meta: String?, val data: UserLogin?)
