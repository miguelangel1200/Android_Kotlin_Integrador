package com.demo.retrofithttpmethods

import com.demo.retrofithttpmethods.data.Course
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface RetroServiceInterface {

    @POST("api/auth/signup")
    @Headers("Accept:application/json", "Content-Type:application/json",
    "Authorization: Bearer 73668350bdf06c66f3388408c1a712b378c3e25da599753b21b664a6261e246c")
    fun createUser(@Body params: User): Call<UserResponse>


    @POST("api/auth/signin")
    @Headers("Accept:application/json", "Content-Type:application/json")
    fun loginUser(@Body params: UserLogin): Call<UserLoginResponse>

    @GET("cursoes")
    fun getCoursesList(): Call<List<Course>>
}