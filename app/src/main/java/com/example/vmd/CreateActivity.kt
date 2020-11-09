package com.example.vmd



import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CreateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)


        val login_button : Button = findViewById<Button>(R.id.loginpage)

        login_button.setOnClickListener{

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}