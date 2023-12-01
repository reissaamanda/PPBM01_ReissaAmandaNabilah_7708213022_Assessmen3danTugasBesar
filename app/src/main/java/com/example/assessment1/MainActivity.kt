package com.example.assessment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_pindah= findViewById<Button>(R.id.btn_start)

        btn_pindah.setOnClickListener {
            val _intentPindah =
                Intent( this, LogIn::class.java )

            startActivity(_intentPindah)
        }
    }
}