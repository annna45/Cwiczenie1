package com.example.cwiczenie1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun onClickSwitchToLogin(v: View) {
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

}