package com.demo.retrofithttpmethods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.demo.retrofithttpmethods.adapter.CourseListAdapter
import com.demo.retrofithttpmethods.viewmodel.CourseActivityViewModel
import kotlinx.android.synthetic.main.activity_course.*

class CourseActivity : AppCompatActivity() {
    lateinit var recyclerAdapter: CourseListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course)

        initRecyclerView()
        initViewModel()
    }

    private fun initRecyclerView() {
        coursesListRecyclerview.layoutManager = LinearLayoutManager(this)
        recyclerAdapter = CourseListAdapter(this)
        coursesListRecyclerview.adapter =recyclerAdapter

    }

    private fun initViewModel() {
        val viewModel: CourseActivityViewModel = ViewModelProvider(this).get(CourseActivityViewModel::class.java)
        viewModel.getLiveDataObserver().observe(this, Observer {
            if(it != null) {
                recyclerAdapter.setCountryList(it)
                recyclerAdapter.notifyDataSetChanged()
            } else {
                Toast.makeText(this, "Error in getting list", Toast.LENGTH_SHORT).show()
            }
        })
        viewModel.makeAPICall()
    }
}