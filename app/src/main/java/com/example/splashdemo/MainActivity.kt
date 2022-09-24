package com.example.splashdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val postDelayed = Handler().postDelayed({

            val a = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(a)
        }, 3000)


    }
}