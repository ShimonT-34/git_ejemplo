package com.example.android_eva2_iot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = findViewById<EditText>(R.id.etUser)
        val pass = findViewById<EditText>(R.id.etPass)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnRecover = findViewById<Button>(R.id.btnRecover)
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        btnLogin.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Inicio de sesión")
                .setMessage("Bienvenido, ${user.text} (simulado).")
                .setPositiveButton("OK", null)
                .show()
        }

        btnRecover.setOnClickListener {
            startActivity(Intent(this, RecoverActivity::class.java))
        }

        btnRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}
