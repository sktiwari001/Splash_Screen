package com.example.splash_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //This below piece of code is use to remove action bar...
        supportActionBar?.hide()

        Handler().postDelayed({
            val intent=Intent(this,SecondActivity::class.java)
            startActivity(intent)
        },3000)
    }
}