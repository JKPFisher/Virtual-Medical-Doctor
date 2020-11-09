package com.example.vmd



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)



        val logout_button :Button = findViewById<Button>(R.id.logout)

        logout_button.setOnClickListener{

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

        val textview : TextView = findViewById<TextView>(R.id.textView2)
        val intent : Intent = getIntent()
        val msg : String? = intent.getStringExtra( "name")
        textview.setText(""+msg)
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

