package com.droiddev26.pluto_ev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

var click = 0

const val scaleMinus = 0f
const val scalePlus = 1f
const val duration = 1500L
const val rotation = 1080f



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pluto1ImageView = findViewById<ImageView>(R.id.pluto_1)
        pluto1ImageView.animate().rotation(rotation).scaleX(scalePlus).scaleY(
            scalePlus).setDuration(duration)

    }

    fun erasePluto(view: View) {
        click++

        when (click) {
            1 -> {
                val pluto1ImageView = findViewById<ImageView>(R.id.pluto_1)
                pluto1ImageView.animate().alpha(0.0F).rotation(-rotation).scaleX(scaleMinus).scaleY(
                    scaleMinus).setDuration(duration)

                val pluto2ImageView = findViewById<ImageView>(R.id.pluto_2)
                pluto2ImageView.animate().alpha(1.0F).rotation(rotation).scaleX(scalePlus).scaleY(
                    scalePlus).setDuration(duration)
            }
            2 -> {
                val pluto1ImageView = findViewById<ImageView>(R.id.pluto_2)
                pluto1ImageView.animate().alpha(0.0F).rotation(-rotation).scaleX(scaleMinus).scaleY(
                    scaleMinus).setDuration(duration)

                val pluto2ImageView = findViewById<ImageView>(R.id.pluto_3)
                pluto2ImageView.animate().alpha(1.0F).rotation(rotation).scaleX(scalePlus).scaleY(
                    scalePlus).setDuration(duration)
            }
            3 -> {
                val pluto1ImageView = findViewById<ImageView>(R.id.pluto_3)
                pluto1ImageView.animate().alpha(0.0F).rotation(-rotation).scaleX(scaleMinus).scaleY(
                    scaleMinus).setDuration(duration)

                val pluto2ImageView = findViewById<ImageView>(R.id.pluto_4)
                pluto2ImageView.animate().alpha(1.0F).rotation(rotation).scaleX(scalePlus).scaleY(
                    scalePlus).setDuration(duration)
            }
            4 -> {
                val pluto1ImageView = findViewById<ImageView>(R.id.pluto_4)
                pluto1ImageView.animate().alpha(0.0F).rotation(-rotation).scaleX(scaleMinus).scaleY(
                    scaleMinus).setDuration(duration)

                val pluto2ImageView = findViewById<ImageView>(R.id.pluto_5)
                pluto2ImageView.animate().alpha(1.0F).rotation(rotation).scaleX(scalePlus).scaleY(
                    scalePlus).setDuration(duration)
            }
            5 -> {
                val pluto1ImageView = findViewById<ImageView>(R.id.pluto_5)
                pluto1ImageView.animate().alpha(0.0F).rotation(-rotation).scaleX(scaleMinus).scaleY(
                    scaleMinus).setDuration(duration)

                val pluto2ImageView = findViewById<ImageView>(R.id.pluto_6)
                pluto2ImageView.animate().alpha(1.0F).rotation(rotation).scaleX(scalePlus).scaleY(
                    scalePlus).setDuration(duration)
            }
            6 -> {
                val pluto1ImageView = findViewById<ImageView>(R.id.pluto_6)
                pluto1ImageView.animate().alpha(0.0F).rotation(-rotation).scaleX(scaleMinus).scaleY(
                    scaleMinus).setDuration(duration)

                val pluto2ImageView = findViewById<ImageView>(R.id.pluto_7)
                pluto2ImageView.animate().alpha(1.0F).rotation(rotation).scaleX(scalePlus).scaleY(
                    scalePlus).setDuration(duration)
            }
            7 -> {
                val pluto1ImageView = findViewById<ImageView>(R.id.pluto_7)
                pluto1ImageView.animate().alpha(0.0F).rotation(-rotation).scaleX(scaleMinus).scaleY(
                    scaleMinus).setDuration(duration)

                val pluto2ImageView = findViewById<ImageView>(R.id.pluto_my)
                pluto2ImageView.animate().alpha(1.0F).rotation(rotation).scaleX(scalePlus).scaleY(
                    scalePlus).setDuration(duration)
            }
            8 -> {
                val pluto1ImageView = findViewById<ImageView>(R.id.pluto_my)
                pluto1ImageView.animate().alpha(0.0F).rotation(-rotation).scaleX(scaleMinus).scaleY(
                    scaleMinus).setDuration(duration)

                val pluto2ImageView = findViewById<ImageView>(R.id.pluto_1)
                pluto2ImageView.animate().alpha(1.0F).rotation(rotation).scaleX(scalePlus).scaleY(
                    scalePlus).setDuration(duration)
            }
        }

        if (click == 8) {
            click = 0
        }
    }
}