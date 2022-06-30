package com.demo.retrofithttpmethods

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivityViewModel : ViewModel() {
    lateinit var loginUserLiveData: MutableLiveData<UserLoginResponse?>
    init {
        loginUserLiveData = MutableLiveData()
    }

    fun getLoginUserObserver(): MutableLiveData<UserLoginResponse?> {
        return loginUserLiveData
    }


    fun LoginUser(user: UserLogin) {
        val retroService =
            RetroInstance.getRetroInstance().create(RetroServiceInterface::class.java)
        val call = retroService.loginUser(user)
        call.enqueue(object : Callback<UserLoginResponse> {
            override fun onFailure(call: Call<UserLoginResponse>, t: Throwable) {
                loginUserLiveData.postValue(null)
            }

            override fun onResponse(call: Call<UserLoginResponse>, response: Response<UserLoginResponse>) {
                if (response.isSuccessful) {
                    loginUserLiveData.postValue(response.body())
                } else {
                    loginUserLiveData.postValue(null)
                }
            }


        })
    }
}