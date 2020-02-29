package com.geektech.firstkotlinapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val userName = intent.getStringExtra("userName")
        val password = intent.getStringExtra("password")

        text.text.let {  }
        if (userName !=null){
            val message = "User Name: $userName \n Password:  $password"
            text.text = message

        }

    }
}
