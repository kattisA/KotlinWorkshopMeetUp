package com.brainyful.kotlinmeetup

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
           toastMsg("Hello World of Meet up", this)
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }


}
