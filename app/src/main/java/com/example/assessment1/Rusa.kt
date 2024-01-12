package com.example.assessment1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class Rusa : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rusa)

        val imageList = ArrayList<SlideModel>() // Create image list


        imageList.add(SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTvG01cg_agHrX-ZY9ZEbnoW-HDUjEehSmDKg&usqp=CAU"))
        imageList.add(SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTw6fzfzss8rQ6tACnyzHo_MKa2asUpf0W_GA&usqp=CAU"))
        imageList.add(SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSZL7UXLSHh---NAvSME9ctR6rvk2Rwh9e38w&usqp=CAU"))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider3)
        imageSlider.setImageList(imageList)

        val img_pindah= findViewById<ImageView>(R.id.cross)

        img_pindah.setOnClickListener {
            val _intentPindah =
                Intent(this, HomeFragment::class.java)

            startActivity(_intentPindah)
        }
    }
}