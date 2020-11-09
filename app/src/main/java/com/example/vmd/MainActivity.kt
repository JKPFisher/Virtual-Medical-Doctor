package com.example.vmd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Email : EditText = findViewById<EditText>(R.id.EmailAddress)
        val password :EditText = findViewById<EditText>(R.id.editTextTextPassword)
        val login_button :Button = findViewById<Button>(R.id.loginbutton)

        login_button.setOnClickListener{
        if(Email.text.toString().equals("jenneferfisher0900@gmail.com") &&
                password.text.toString().equals("admin")){
                val intent = Intent(this, HomeActivity::class.java)
            val msg = intent.putExtra("name" , Email.text.toString())
            startActivity(intent)
            }
        }


        val signup_button :Button = findViewById<Button>(R.id.signup)

        signup_button.setOnClickListener{

                val intent = Intent(this, SignUpActivity::class.java)
                startActivity(intent)

        }

        }
    }

