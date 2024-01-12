package com.example.assessment1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Registrasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)

        val btn_pindah= findViewById<Button>(R.id.btn_signup)

        btn_pindah.setOnClickListener {
            val _intentPindah =
                Intent(this, Fragment::class.java)

            startActivity(_intentPindah)
        }

        val text_pindah= findViewById<TextView>(R.id.text_login)

        text_pindah.setOnClickListener {
            val _intentPindah =
                Intent(this, LogIn::class.java)

            startActivity(_intentPindah)
        }
    }
}