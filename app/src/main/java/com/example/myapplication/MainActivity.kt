package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickme = findViewById<Button>(R.id.clickme1)
        val tvMytextview = findViewById<TextView>(R.id.textView)
        var clicktimes = 0;

        btnClickme.setOnClickListener {
            //btnClickme.text = "Thanks for Clicking me"
           // tvMytextview.text="Button Has been clicked"

            clicktimes+=1
            tvMytextview.text= clicktimes.toString()
            Toast.makeText(this, "I love you as many times as you click",Toast.LENGTH_LONG).show()
        }





    }
}
