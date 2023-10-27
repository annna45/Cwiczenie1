package com.example.cwiczenie1

import android.content.Intent
import android.content.Intent.ACTION_DIAL
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val przyciskA=findViewById<Button>(R.id.button)

        Log.d("MainActivity","zalogowane jako DEBUG")
        Log.e("MainActivity","zalogowane jako ERROR")
        Log.w("MainActivity","zalogowane jako WARNING")
        Log.i("MainActivity","zalogowane jako INFORMATION")
        Log.v("MainActivity","zalogowane jako VERBOSE (tryb gadatliwy)")

        przyciskA.setOnClickListener {
            przyciskA.setText("klikniety - in listener")
        }
    }
    fun ButtonClick(v: View) {
        val przyciskB: Button=findViewById(R.id.button6)
        przyciskB.setText("klikniety")

        val intencja = Intent(ACTION_DIAL, Uri.parse("tel:123"))
        startActivity(intencja)
    }

    fun onClickSwitchToRegister(v:View) {
        val intent=Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }
}