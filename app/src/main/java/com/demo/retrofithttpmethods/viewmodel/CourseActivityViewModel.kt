package com.demo.retrofithttpmethods.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.demo.retrofithttpmethods.RetroInstance
import com.demo.retrofithttpmethods.RetroServiceInterface
import com.demo.retrofithttpmethods.data.Course
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CourseActivityViewModel : ViewModel() {
    lateinit var liveDataList: MutableLiveData<List<Course>>

    init {
        liveDataList = MutableLiveData()
    }


    fun getLiveDataObserver(): MutableLiveData<List<Course>> {
        return liveDataList
    }

    fun makeAPICall() {
        val retroInstance = RetroInstance.getRetroInstance()
        val retroService  = retroInstance.create(RetroServiceInterface::class.java)
        val call  = retroService.getCoursesList()
        call.enqueue(object : Callback<List<Course>> {
            override fun onFailure(call: Call<List<Course>>, t: Throwable) {
                liveDataList.postValue(null)
            }

            override fun onResponse(
                call: Call<List<Course>>,
                response: Response<List<Course>>
            ) {
                liveDataList.postValue(response.body())
            }
        })


    }
}