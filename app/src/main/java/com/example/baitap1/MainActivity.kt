package com.example.baitap1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick = findViewById<Button>(R.id.btnClickMe)

        btnClick.setOnClickListener {
            Toast.makeText(this, "Xin chào! Bạn vừa bấm nút.", Toast.LENGTH_SHORT).show()
        }
    }
}
