package com.example.vmd

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val textview : TextView= findViewById<TextView>(R.id.textView)
        val intent : Intent = getIntent()
        val msg : String? = intent.getStringExtra( "name")
        textview.setText("Hello Android"+msg)
    }

}