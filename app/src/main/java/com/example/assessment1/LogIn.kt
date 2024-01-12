package com.example.assessment1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        supportActionBar?.hide()

        val email = findViewById<EditText>(R.id.edt1)
        val password = findViewById<EditText>(R.id.edt2)
        val tombollogin = findViewById<Button>(R.id.btn_login)
        val text_pindah = findViewById<TextView>(R.id.text_signup)

        text_pindah.setOnClickListener {
            val _intentPindahText =
                Intent(this, Registrasi::class.java)

            startActivity(_intentPindahText)
        }

        tombollogin.setOnClickListener {
            val enteredEmail = email.text.toString()
            val enteredPassword = password.text.toString()

            if (enteredEmail.isNotEmpty() && enteredPassword.isNotEmpty()) {
                if (isLoginValid(enteredEmail, enteredPassword)) {
                    // Login berhasil, arahkan ke halaman menu.
                    val intent = Intent(this, Fragment::class.java)
                    startActivity(intent)
                    finish() // Optional: Tutup halaman login.
                } else {
                    Toast.makeText(
                        this,
                        "Login gagal. Cek kembali email dan password Anda.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            } else {
                Toast.makeText(this, "Isi email dan password terlebih dahulu.", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }

    private fun isLoginValid(enteredEmail: String, enteredPassword: String): Boolean {
        return (enteredEmail == "reissaamanda05@gmail.com" && enteredPassword == "1234") ||
                (enteredEmail == "reissa" && enteredPassword == "12345") ||
                (enteredEmail == "amanda" && enteredPassword == "123456")
    }
}