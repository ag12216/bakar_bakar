package com.freelancer.bakarbakar

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.core.os.postDelayed
import butterknife.BindView
import butterknife.ButterKnife
import com.freelancer.bakarbakar.Login.LoginScreen

class SplashScreen : AppCompatActivity() {

    @BindView(R.id.idSplashImage) lateinit var splashImageView: ImageView


    //MARK: Declaring local variables
    private val SPLASH_TIME_OUT: Long = 6000 //2sec


    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        ButterKnife.bind(this)

        matchStatusBarColor()
        Handler().postDelayed({
            startActivity(Intent(this,LoginScreen::class.java))
            finish()
        },SPLASH_TIME_OUT)

    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun matchStatusBarColor(){
        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = ContextCompat.getColor(this,R.color.colorPrimary)
    }
}
