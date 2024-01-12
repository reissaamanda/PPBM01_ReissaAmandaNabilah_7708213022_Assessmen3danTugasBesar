package com.example.assessment1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class Domba : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_domba)

        val imageList = ArrayList<SlideModel>() // Create image list

        imageList.add(SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5WM2VIRrGlydWVzV-teQCaj9Ieg8EweiyHw&usqp=CAU"))
        imageList.add(SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSt7lp9FQrLn7IyjL6790rWuH6UVoOqBwYDOA&usqp=CAU"))
        imageList.add(SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQv3xzPTXDio6nQ566AYqatvKKSKReSEU_XFg&usqp=CAU"))


        val imageSlider = findViewById<ImageSlider>(R.id.image_slider2)
        imageSlider.setImageList(imageList)

        val img_pindah= findViewById<ImageView>(R.id.cross)

        img_pindah.setOnClickListener {
            val _intentPindah =
                Intent(this, HomeFragment::class.java)

            startActivity(_intentPindah)
        }
    }
}