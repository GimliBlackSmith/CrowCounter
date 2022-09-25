package com.evg.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
//    val textView: TextView = findViewById(R.id.textView_Hello)
//    val buttonHello: Button = findViewById(R.id.button_say_hello)
//    val buttonCounter: Button = findViewById(R.id.button_counter)
//    private var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView_Hello)
        val buttonHello: Button = findViewById(R.id.button_say_hello)
        val buttonCounter: Button = findViewById(R.id.button_counter)
        val buttonAnnul: Button = findViewById(R.id.button_Annul)
        var counter: Int = 0

        buttonHello.setOnClickListener {
            textView.text = "Hello Kitty!"
        }
        buttonCounter.setOnClickListener {
            textView.text = "Я насчитал ${++counter} ворон"
        }
        buttonAnnul.setOnClickListener {
            counter = 0
            textView.text = "Я насчитал ${counter} ворон"
        }
    }


}