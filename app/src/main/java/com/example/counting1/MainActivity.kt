package com.example.counting1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var tt: TextView
    private var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Handle system bars padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val bb: Button = findViewById(R.id.button_o)
        val cc: Button = findViewById(R.id.reset_o)
        tt = findViewById(R.id.textView_o)

        // Update the TextView with the current counter value
        tt.text = counter.toString()

        // Increment counter on button press
        bb.setOnClickListener {
            counter++
            tt.text = counter.toString()
        }

        // Reset counter on button press
        cc.setOnClickListener {
            counter = 0
            tt.text = counter.toString()
        }
    }


    }

