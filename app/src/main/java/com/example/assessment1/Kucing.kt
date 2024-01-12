package com.example.assessment1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class Kucing : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kucing)

        val imageList = ArrayList<SlideModel>() // Create image list

        imageList.add(SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcThKuKUwxvE42dQLhlka0yR4bu28YRp0Z8jfA&usqp=CAU"))
        imageList.add(SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSvhoZAK6ejJvT5HeqEVPs2UPX7OoVhiZymBA&usqp=CAU"))
        imageList.add(SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRhbNybkAP4qA9DUCb4wfu8xQgWsRokzWvfWw&usqp=CAU"))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider1)
        imageSlider.setImageList(imageList)

        val img_pindah= findViewById<ImageView>(R.id.cross)

        img_pindah.setOnClickListener {
            val _intentPindah =
                Intent(this, HomeFragment::class.java)

            startActivity(_intentPindah)
        }
    }
}