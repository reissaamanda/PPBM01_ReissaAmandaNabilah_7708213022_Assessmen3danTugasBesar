package com.example.assessment1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class XActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_x)

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

        val btn_pindah2= findViewById<ImageView>(R.id.imageview3)

        btn_pindah2.setOnClickListener {
            val _intentPindah2 =
                Intent(this, Dashboard::class.java)

            startActivity(_intentPindah2)
        }

        val tweetItems = listOf(
            TweetItem("Zakiatun", "This is tweet 1", R.drawable.cat),
            TweetItem("Nadela", "This is tweet 2", R.drawable.deer),
            // ... tambahkan data lainnya
        )

// Buat adapter dan atur pada ListView
        val adapter = TweetAdapter(this, tweetItems)
        val listView: ListView = findViewById(R.id.listView)
        listView.adapter = adapter
    }
}
