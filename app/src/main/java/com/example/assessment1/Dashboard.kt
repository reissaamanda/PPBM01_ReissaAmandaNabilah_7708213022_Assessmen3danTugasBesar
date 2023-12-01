package com.example.assessment1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Dashboard : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val btn_pindah= findViewById<ImageView>(R.id.imageview2)

        btn_pindah.setOnClickListener {
            val _intentPindah =
                Intent(this, XActivity::class.java)

            startActivity(_intentPindah)
        }

        val btn_pindah1= findViewById<ImageView>(R.id.imageview1)

        btn_pindah1.setOnClickListener {
            val _intentPindah1 =
                Intent(this, Article::class.java)

            startActivity(_intentPindah1)
        }

        val btn_pindah2= findViewById<Button>(R.id.btn_kucing)

        btn_pindah2.setOnClickListener {
            val _intentPindah2 =
                Intent(this, Kucing::class.java)

            startActivity(_intentPindah2)
        }

        val btn_pindah3= findViewById<Button>(R.id.btn_rusa)

        btn_pindah3.setOnClickListener {
            val _intentPindah3 =
                Intent(this, Rusa::class.java)

            startActivity(_intentPindah3)
        }

        val btn_pindah4= findViewById<Button>(R.id.btn_ikan)

        btn_pindah4.setOnClickListener {
            val _intentPindah4 =
                Intent(this, Ikan::class.java)

            startActivity(_intentPindah4)
        }

        val btn_pindah5= findViewById<Button>(R.id.btn_domba)

        btn_pindah5.setOnClickListener {
            val _intentPindah5 =
                Intent(this, Domba::class.java)

            startActivity(_intentPindah5)
        }

        val btn_pindah6= findViewById<ImageView>(R.id.btn_info)

        btn_pindah6.setOnClickListener {
            val _intentPindah6 =
                Intent(this, Info::class.java)

            startActivity(_intentPindah6)
        }
    }
}