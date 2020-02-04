package com.freelancer.bakarbakar.Login

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import com.freelancer.bakarbakar.HomeScreen
import com.freelancer.bakarbakar.R
import com.libizo.CustomEditText


class OtpVerificationScreen : AppCompatActivity() {

    @BindView(R.id.idEmailEditText)
    lateinit var emailField: CustomEditText
    @BindView(R.id.idMsg)
    lateinit var labelMsg: TextView
    @BindView(R.id.idGetOtpButton)
    lateinit var getOtpButton: Button
    @BindView(R.id.idResendMsg)
    lateinit var resendTextView: TextView
    @BindView(R.id.idOtpLogo)
    lateinit var logoImageView: ImageView

    var flag = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp_verification_screen)

        ButterKnife.bind(this)
    }

    @OnClick(R.id.idGetOtpButton)
    internal fun didTapGetOtPButton() {
        if (flag) {
            flag = false
            labelMsg.text = "You will get a OTP via email"
            getOtpButton.text = "VERIFY"
            emailField.text?.clear()
            emailField.hint = "Enter the Otp"
            emailField.inputType =
                InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            resendTextView.visibility = View.VISIBLE
            logoImageView.setImageResource(R.drawable.ic_otp_verifymobile)
        }
        else{
            val homeScreen = Intent(this,HomeScreen::class.java)
            startActivity(homeScreen)
        }

    }

}
