package com.freelancer.bakarbakar.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import com.freelancer.bakarbakar.R

class LoginScreen : AppCompatActivity(){

    @BindView(R.id.idEmailEditText) lateinit var emailField: EditText
    @BindView(R.id.idPasswordEditText) lateinit var passwordField: EditText
    @BindView(R.id.idLoginButton) lateinit var loginButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        ButterKnife.bind(this)

    }

    @OnClick(R.id.idLoginButton)
    internal fun didTapLoginButton(){
        val signUpScreen = Intent(this,SignUpScreen::class.java)
        startActivity(signUpScreen)
    }

}
