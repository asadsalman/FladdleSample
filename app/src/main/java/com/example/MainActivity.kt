package com.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.btn)
        val txt = findViewById<TextView>(R.id.txt)
        btn.setOnClickListener {
            Toast.makeText(this@MainActivity, "Text should appear", Toast.LENGTH_SHORT).show()
            if (txt.visibility == View.VISIBLE)
                txt.visibility = View.INVISIBLE
            else
                txt.visibility = View.VISIBLE
        }
    }
}