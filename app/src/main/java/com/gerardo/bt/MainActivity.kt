package com.gerardo.bt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.gerardo.bt.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //get reference to button
        val btnLogIn = findViewById(R.id.loginBtn) as Button
        //set on click listener
        btnLogIn.setOnClickListener{
            val loginIntent = Intent(this, ScreenLogin::class.java)
            startActivity(loginIntent)
        }
    }
}