package com.demo.retrofithttpmethods

import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : AppCompatActivity() {

    lateinit var viewModel: LoginActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setStatusBarTransparent(this@LoginActivity)
        initViewModel()
        buttonLogin.setOnClickListener {
            loginUser()
        }
    }

    private fun setStatusBarTransparent(activity: AppCompatActivity){
        //Make Status bar transparent
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            activity.window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        }
        //Make status bar icons color dark
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            activity.window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            activity.window.statusBarColor = Color.WHITE
        }
    }

    private fun loginUser() {
        val userlog  = UserLogin("", logTextUserName.text.toString(),logTextPassword.text.toString() )
        viewModel.LoginUser(userlog)

    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(this).get(LoginActivityViewModel::class.java)
        viewModel.getLoginUserObserver().observe(this, Observer <UserLoginResponse?>{

            if(it  == null) {
                Toast.makeText(this@LoginActivity, "Error de Usuario", Toast.LENGTH_LONG).show()
            } else {
                //{"code":201,"meta":null,"data":{"id":2877,"name":"xxxxxaaaaabbbbb","email":"xxxxxaaaaabbbbb@gmail.com","gender":"male","status":"active"}}
                Toast.makeText(this@LoginActivity, "Bienvenido", Toast.LENGTH_LONG).show()
                val intent = Intent(this, CourseActivity::class.java)
                startActivity(intent)
            }
        })
    }

    fun onClick(view: View) {
        if(view.id == R.id.button_signup){
            startActivity(Intent(this@LoginActivity, MainActivity::class.java))
        }
    }
}