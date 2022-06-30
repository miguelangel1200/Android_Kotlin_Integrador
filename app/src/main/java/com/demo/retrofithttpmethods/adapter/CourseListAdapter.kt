package com.demo.retrofithttpmethods.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.demo.retrofithttpmethods.R
import com.demo.retrofithttpmethods.data.Course
import kotlinx.android.synthetic.main.courses_list_row.view.*

class CourseListAdapter(val activity: Activity): RecyclerView.Adapter<CourseListAdapter.MyViewHolder>() {

    private var courseList: List<Course>? = null


    fun setCountryList(countryList: List<Course>?) {
        this.courseList = countryList
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CourseListAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.courses_list_row, parent, false)

        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: CourseListAdapter.MyViewHolder, position: Int) {
        holder.bind(courseList?.get(position)!!, activity)
    }

    override fun getItemCount(): Int {
        if(courseList == null)return 0
        else return courseList?.size!!
    }

    class MyViewHolder(view : View): RecyclerView.ViewHolder(view){
        //val flagImage = view.courseImage
        val tvName = view.tvName
        val tvDescription = view.tvDescription
        val tvPrice = view.tvPrice

        fun bind(data: Course, activity: Activity) {
            tvName.text = "Nombre: "+data.name
            tvDescription.text = "Descripción: "+data.description
            tvPrice.text = "Precio: "+data.precio

            //GlideToVectorYou.justLoadImage(activity, Uri.parse(data.flag), flagImage)

        }
    }
}