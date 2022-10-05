package com.droiddev26.pluto_ev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

var click = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun erasePluto(view: View) {
        click++

        when (click) {
            1 -> {
                var pluto1ImageView = findViewById<ImageView>(R.id.pluto_1)
                pluto1ImageView.animate().alpha(0.0F).setDuration(2000)

                var pluto2ImageView = findViewById<ImageView>(R.id.pluto_2)
                pluto2ImageView.animate().alpha(1.0F).setDuration(2000)
            }
            2 -> {
                var pluto1ImageView = findViewById<ImageView>(R.id.pluto_2)
                pluto1ImageView.animate().alpha(0.0F).setDuration(2000)

                var pluto2ImageView = findViewById<ImageView>(R.id.pluto_3)
                pluto2ImageView.animate().alpha(1.0F).setDuration(2000)
            }
            3 -> {
                var pluto1ImageView = findViewById<ImageView>(R.id.pluto_3)
                pluto1ImageView.animate().alpha(0.0F).setDuration(2000)

                var pluto2ImageView = findViewById<ImageView>(R.id.pluto_4)
                pluto2ImageView.animate().alpha(1.0F).setDuration(2000)
            }
            4 -> {
                var pluto1ImageView = findViewById<ImageView>(R.id.pluto_4)
                pluto1ImageView.animate().alpha(0.0F).setDuration(2000)

                var pluto2ImageView = findViewById<ImageView>(R.id.pluto_5)
                pluto2ImageView.animate().alpha(1.0F).setDuration(2000)
            }
            5 -> {
                var pluto1ImageView = findViewById<ImageView>(R.id.pluto_5)
                pluto1ImageView.animate().alpha(0.0F).setDuration(2000)

                var pluto2ImageView = findViewById<ImageView>(R.id.pluto_6)
                pluto2ImageView.animate().alpha(1.0F).setDuration(2000)
            }
            6 -> {
                var pluto1ImageView = findViewById<ImageView>(R.id.pluto_6)
                pluto1ImageView.animate().alpha(0.0F).setDuration(2000)

                var pluto2ImageView = findViewById<ImageView>(R.id.pluto_7)
                pluto2ImageView.animate().alpha(1.0F).setDuration(2000)
            }
            7 -> {
                var pluto1ImageView = findViewById<ImageView>(R.id.pluto_7)
                pluto1ImageView.animate().alpha(0.0F).setDuration(2000)

                var pluto2ImageView = findViewById<ImageView>(R.id.pluto_my)
                pluto2ImageView.animate().alpha(1.0F).setDuration(2000)
            }
            8 -> {
                var pluto1ImageView = findViewById<ImageView>(R.id.pluto_my)
                pluto1ImageView.animate().alpha(0.0F).setDuration(2000)

                var pluto2ImageView = findViewById<ImageView>(R.id.pluto_1)
                pluto2ImageView.animate().alpha(1.0F).setDuration(2000)
            }
        }

        if (click == 8) {
            click = 0
        }
    }
}