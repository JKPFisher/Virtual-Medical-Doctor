package com.example.vmd

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)


        val back_button :Button = findViewById<Button>(R.id.backbuttonsignup)

        back_button.setOnClickListener{

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }



    val create_button :Button = findViewById<Button>(R.id.button2)

    create_button.setOnClickListener{

        val intent = Intent(this, CreateActivity::class.java)
        startActivity(intent)

    }



}  }