package com.example.spels

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


var points: Int = 1


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val button1 = findViewById<Button>(R.id.button_1)
        button1.setOnClickListener {
            val rand1: Int = Random.nextInt(from = 1, until = 4)
            if (rand1 == 1) {
                setContentView(R.layout.button_activity)
                val buttonre = findViewById<Button>(R.id.button_re)
                buttonre.setOnClickListener {
                    points = 0
                    recreate()
                }
            } else {
                points++
                setContentView(R.layout.activity_wait)
                val buttongo = findViewById<Button>(R.id.button_go)
                buttongo.setOnClickListener {
                    recreate()
                }
            }
        }

        val button2 = findViewById<Button>(R.id.button_2)
        button2.setOnClickListener {
            val rand2: Int = Random.nextInt(from = 1, until = 4)
            if (rand2 == 2) {
                setContentView(R.layout.button_activity)
                val buttonre = findViewById<Button>(R.id.button_re)
                buttonre.setOnClickListener {
                    points = 0
                    recreate()
                }
            } else {
                points++
                setContentView(R.layout.activity_wait)
                val buttongo = findViewById<Button>(R.id.button_go)
                buttongo.setOnClickListener {
                    recreate()
                }
            }
        }

        val button3 = findViewById<Button>(R.id.button_3)
        button3.setOnClickListener {
            val rand3: Int = Random.nextInt(from = 1, until = 4)
            if (rand3 == 3) {
                setContentView(R.layout.button_activity)
                val buttonre = findViewById<Button>(R.id.button_re)
                buttonre.setOnClickListener {
                    points = 0
                    recreate()
                }
            } else {
                points++
                setContentView(R.layout.activity_wait)
                val buttongo = findViewById<Button>(R.id.button_go)
                buttongo.setOnClickListener {
                    recreate()
                }
            }
        }

    }
}