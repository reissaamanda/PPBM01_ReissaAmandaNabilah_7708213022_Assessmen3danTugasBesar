package com.example.assessment1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AdapterView
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class Settings : AppCompatActivity() {

    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radioGroup: RadioGroup = findViewById(R.id.radiogroup)
        val radioButtonOption1: RadioButton = findViewById(R.id.radioButtonOption1)
        val radioButtonOption2: RadioButton = findViewById(R.id.radioButtonOption2)

        val img_pindah= findViewById<ImageView>(R.id.cross)

        img_pindah.setOnClickListener {
            val _intentPindah =
                Intent(this, Profile::class.java)

            startActivity(_intentPindah)
        }

        val button_pindah= findViewById<Button>(R.id.btn_edit)

        button_pindah.setOnClickListener {
            val _intentPindah1 =
                Intent(this, Profile::class.java)

            startActivity(_intentPindah1)
        }

        val spinner = findViewById<Spinner>(R.id.spinner1)

        // Inisialisasi adapter dengan sumber daya string
        val adapter = ArrayAdapter.createFromResource(
            this, R.array.spinner_items, android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        // Menangani pemilihan dari Spinner
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val selectedItem = parent?.getItemAtPosition(position).toString()
                // Lakukan sesuatu dengan item yang dipilih
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Tindakan saat tidak ada yang dipilih
            }
        }

    }
}
