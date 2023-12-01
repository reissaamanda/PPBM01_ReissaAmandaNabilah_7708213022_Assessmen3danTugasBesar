package com.example.assessment1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner

class Pengaturan : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengaturan)

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

        val data = arrayOf("FIT", "FIK", "FEB", "FKB", "FTE", "FIF", "FRI")

        val spinner: Spinner = findViewById(R.id.spinner)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, data)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val selectedItem = data[position]
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }


    }
}