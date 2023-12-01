package com.example.assessment1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class Profile : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val img_pindah= findViewById<ImageView>(R.id.imageview1)

        img_pindah.setOnClickListener {
            val _intentPindah =
                Intent(this, Article::class.java)

            startActivity(_intentPindah)
        }

        val img_pindah1= findViewById<ImageView>(R.id.imageview)

        img_pindah1.setOnClickListener {
            val _intentPindah1 =
                Intent(this, Dashboard::class.java)

            startActivity(_intentPindah1)
        }

        val img_pindah2= findViewById<ImageView>(R.id.settings)

        img_pindah2.setOnClickListener {
            val _intentPindah2 =
                Intent(this, Pengaturan::class.java)

            startActivity(_intentPindah2)
        }
    }
}