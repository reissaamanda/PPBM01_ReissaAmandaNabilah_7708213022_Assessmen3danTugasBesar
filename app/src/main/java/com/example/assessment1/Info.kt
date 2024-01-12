package com.example.assessment1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetDialog

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
                Intent(this, HomeFragment::class.java)

            startActivity(_intentPindah)
        }

    }

    fun showBottomSheet(view: View) {
        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R. layout. bottomsheet, null)
        val btnClose = view.findViewById<Button>(R.id.idButtonDismiss)
        btnClose.setOnClickListener {
            dialog.dismiss()
        }
        dialog.setCancelable(false)
        dialog.setContentView(view)
        dialog.show()
    }
}