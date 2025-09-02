package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @Override
    protected fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick: Button = findViewById(R.id.btnClickMe)

        btnClick.setOnClickListener({ v ->
            Toast.makeText(this@MainActivity, "Xin chào! Bạn vừa bấm nút.", Toast.LENGTH_SHORT)
                .show()
        })
    }
}