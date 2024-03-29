package com.example.hw1_hannahjuarez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var isPFP = true
        findViewById<Button>(R.id.switch_button).setOnClickListener {
            if (isPFP) {
                findViewById<ImageView>(R.id.image_view).setImageResource(R.drawable.female_avatar)
                isPFP = false
            } else {
                findViewById<ImageView>(R.id.image_view).setImageResource(R.drawable.hannah_pfp)
                isPFP = true
            }
        }
        findViewById<Button>(R.id.to_grade_activity_button).setOnClickListener {
            startActivity(
                    Intent(this, GradeActivity::class.java)
            )
        }
        findViewById<Button>(R.id.to_favorite_activity_button).setOnClickListener {
            startActivity(
                    Intent(this, FavoriteActivity::class.java)
            )
        }
    }
}