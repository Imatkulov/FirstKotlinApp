package com.geektech.firstkotlinapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainClick()
    }

    val nameList = mutableListOf<String>("444", "Rustam", "Imatkulov", "Asan", "Uson", "Guzel")
    val passList = mutableListOf<String>("444",  "123",      "321",     "123546", "555", "7777")

    private fun mainClick() {
        btn_click.setOnClickListener {
            val userName = userName_txt.text.toString()
            val password = password_txt.text.toString()
            UiManager.showToast("${userName} ${password}", this)
            checkUserData(userName, password)
        }
    }

    private fun checkUserData(userName: String, password: String) {
        if (nameList.contains("Rustam") && passList.contains("123"))
            startActivity(
                Intent(this, ThirdActivity::class.java)
                    .putExtra("condition", userName)
                    .putExtra("condition1", password)
            )
         else if (nameList.contains(userName) && passList.contains(password))
            startActivity(
                Intent(this, SecondActivity::class.java)
                    .putExtra("userName", userName)
                    .putExtra("password", password)
            )

         else {
            UiManager.showToast("Error", this)
        }
    }
}
