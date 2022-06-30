package com.demo.retrofithttpmethods.data

import com.google.gson.annotations.SerializedName

data class Course(
    @SerializedName("name") var name: String?,
    @SerializedName("precio") var precio: Double?,
    @SerializedName("description") var description: String?
)
