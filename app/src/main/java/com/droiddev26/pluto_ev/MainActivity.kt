package com.droiddev26.pluto_ev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun erasePluto(view: View) {
        var pluto1ImageView = findViewById<ImageView>(R.id.pluto_1)
        pluto1ImageView.animate().alpha(0.0F).setDuration(2000)

        var pluto2ImageView = findViewById<ImageView>(R.id.pluto_2)
        pluto2ImageView.animate().alpha(1.0F).setDuration(2000)
    }
}