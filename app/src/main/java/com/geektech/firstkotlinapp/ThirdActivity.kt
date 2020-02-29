package com.geektech.firstkotlinapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val userName = intent?.getStringExtra("condition")
        val password = intent?.getStringExtra("condition1")
        val message = "User Name: $userName \n Password:  $password"
        text_third.text = message

        val textColor = when (message) {
            "444" -> resources.getColor(R.color.colorAccent)

            else -> resources.getColor(R.color.colorPrimary)
        }
        text_third.setTextColor(textColor)


    }
}
