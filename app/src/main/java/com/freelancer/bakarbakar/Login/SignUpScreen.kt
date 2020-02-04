package com.freelancer.bakarbakar.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import com.freelancer.bakarbakar.R

class SignUpScreen : AppCompatActivity() {

    @BindView(R.id.idFirstNameEditText) lateinit var firstName: EditText
    @BindView(R.id.idLastNameEditText) lateinit var lastName: EditText
    @BindView(R.id.idUsernameEditText) lateinit var userName: EditText
    @BindView(R.id.idEmailEditText) lateinit var emailField: EditText
    @BindView(R.id.idPasswordEditText) lateinit var passwordField: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_screen)

        ButterKnife.bind(this)
    }

    @OnClick(R.id.idCreateAccountButton)
    internal fun createAccount(){
        val otpScreen = Intent(this,OtpVerificationScreen::class.java)
        startActivity(otpScreen)
    }
}
