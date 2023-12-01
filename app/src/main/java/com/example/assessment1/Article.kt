package com.example.assessment1

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Article : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article)

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

        var namanama = arrayOf<String>(
            "Kucing",
            "Rusa",
            "Ikan",
            "Domba",
            "Gajah",
            "Lumba-lumba",
            "Kura-kura",
            "Burung Hantu",
            "Semut",
            "Belalang",
            "Lebah",
            "Tupai",
            "Kupu-kupu",
            "Jerapah",
            "Singa",
            "Harimau",
            "Babi"
        )

        val _listview = findViewById<ListView>(R.id.list_viewhewan)
        _listview.adapter = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, namanama
        )

        val adapter: ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1, namanama)
        _listview.adapter = adapter

        _listview.setOnItemClickListener { _, _, position, _ ->
            // Ambil posisi item yang diklik
            val selectedItem = namanama[position]

            // Berdasarkan item yang diklik, buka aktivitas yang sesuai
            when (selectedItem) {
                "Kucing" -> {
                    val intent = Intent(this, Kucing::class.java)
                    startActivity(intent)
                }

                "Rusa" -> {
                    val intent = Intent(this, Rusa::class.java)
                    startActivity(intent)
                }

                "Ikan" -> {
                    val intent = Intent(this, Ikan::class.java)
                    startActivity(intent)
                }

                "Domba" -> {
                    val intent = Intent(this, Domba::class.java)
                    startActivity(intent)
                }

                else -> {
                    _listview.setOnItemClickListener { adapterView, view, i, l ->
                        Toast.makeText(this,
                            "item yang diklik adalah: " + _listview.getItemAtPosition(i),
                            Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }
}