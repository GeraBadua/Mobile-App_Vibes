package com.gerardo.bt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.gerardo.bt.ConectionBT
import com.gerardo.bt.R

class ScreenLogin : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_login)

        usernameEditText = findViewById<EditText>(R.id.textInputEditText)
        passwordEditText = findViewById<EditText>(R.id.editTextTextPassword2)
        val loginButton = findViewById<Button>(R.id.loginButton)

        loginButton.setOnClickListener{
            val homeIntent = Intent(this, ConectionBT::class.java)
            startActivity(homeIntent)
        }


    }
}