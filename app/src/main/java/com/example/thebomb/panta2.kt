package com.example.thebomb

import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class panta2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panta2)
        val backButton = findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener {
            finish()
        }
        val textView = findViewById<TextView>(R.id.textView)
        val extras = intent.extras
        if (extras != null) {
            val peliculaFavorita = extras.getString("peliculaFavorita")
            textView.text = "Tu película favorita es: $peliculaFavorita"
        }
    }
}