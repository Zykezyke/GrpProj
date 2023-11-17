package com.example.grpproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var loginBtn : Button = findViewById(R.id.btnLogin)

        loginBtn.setOnClickListener {
            loginBtn.isSelected != loginBtn.isSelected
        }

    }
}