package com.example.assessment1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class Ikan : AppCompatActivity() {

    private val TAG = "Ikan"
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikan)

        val imageList = ArrayList<SlideModel>() // Create image list

        imageList.add(SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSgLjBa-PiJp1nmuNSemAofmDz8zkRxhf0xcA&usqp=CAU"))
        imageList.add(SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSwvenuJ_nGbu60r3Ly6kymxII40aZtEjjpxw&usqp=CAU"))
        imageList.add(SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSY3pa-viuFl7XHwj_hfcNCGGSp_x7reSxVyg&usqp=CAU"))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)

        val img_pindah= findViewById<ImageView>(R.id.cross)

        img_pindah.setOnClickListener {
            val _intentPindah =
                Intent(this, HomeFragment::class.java)

            startActivity(_intentPindah)
        }
    }
}