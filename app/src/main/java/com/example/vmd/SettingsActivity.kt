package com.example.vmd



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)



        val logout_button :Button = findViewById<Button>(R.id.logout)

        logout_button.setOnClickListener{

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }


        val back_button :Button = findViewById<Button>(R.id.backbuttonsettings)

        back_button.setOnClickListener{

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)

        }

    }
}

