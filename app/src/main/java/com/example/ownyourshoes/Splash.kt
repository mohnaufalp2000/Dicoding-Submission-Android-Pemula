package com.example.ownyourshoes

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class Splash : AppCompatActivity() {
    private val loading = 2000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val splashintent = Intent(this, MainActivity::class.java )
            startActivity(splashintent)
            finish()
        }, loading)

    }
}