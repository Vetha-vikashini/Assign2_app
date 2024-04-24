package com.example.assign2

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val loginButton = findViewById<AppCompatButton>(R.id.signin)

        loginButton.setOnClickListener{
            val signIn=Intent(this,HomePage::class.java)
            startActivity(signIn)
        }

        val register = findViewById<AppCompatButton>(R.id.signup)

        register.setOnClickListener {
            val reg=Intent(this,SignUp::class.java)
            startActivity(reg)
        }
    }
}