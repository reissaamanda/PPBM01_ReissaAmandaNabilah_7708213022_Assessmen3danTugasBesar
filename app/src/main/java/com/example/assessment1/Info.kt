package com.example.assessment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar

class Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)


        ratingBar.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
        }

        ratingBar.rating = 3.0f

        val img_pindah= findViewById<ImageView>(R.id.cross)

        img_pindah.setOnClickListener {
            val _intentPindah =
                Intent(this, Dashboard::class.java)

            startActivity(_intentPindah)
        }

        val button_pindah= findViewById<Button>(R.id.btn_rate)

        button_pindah.setOnClickListener {
            val _intentPindah1 =
                Intent(this, Dashboard::class.java)

            startActivity(_intentPindah1)
        }

    }
}