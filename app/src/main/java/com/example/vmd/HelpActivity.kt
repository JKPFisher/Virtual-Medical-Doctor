package com.example.vmd

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HelpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

//********************NAVIGATION BAR***************************************
        val help_button : Button = findViewById<Button>(R.id.help)
        val appointment_button : Button = findViewById<Button>(R.id.create)
        val home_button : Button = findViewById<Button>(R.id.homebutton)
        val settings_button : Button = findViewById<Button>(R.id.settings)
        val reminders_button : Button = findViewById<Button>(R.id.reminder)

        help_button.setOnClickListener{
            val intent = Intent(this, HelpActivity::class.java)
            startActivity(intent)
        }
        appointment_button.setOnClickListener{
            val intent = Intent(this, AppointmentActivity::class.java)
            startActivity(intent)
        }
        home_button.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        settings_button.setOnClickListener{
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
        reminders_button.setOnClickListener{
            val intent = Intent(this, RemindersActivity::class.java)
            startActivity(intent)
        }
    }
}

