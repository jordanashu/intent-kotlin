package com.example.splashdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        // get reference to all views
        var user_name= findViewById(R.id.user_name) as EditText
        var password = findViewById(R.id.password) as EditText
        var login = findViewById(R.id.login) as Button
        var signup= findViewById(R.id.signup) as Button



        // set on-click listener
        login.setOnClickListener {
            val user_name = user_name.text;
            val password = password.text;
            Toast.makeText(this@LoginActivity, user_name, Toast.LENGTH_LONG).show()



        }

        signup.setOnClickListener {
            startActivity(Intent(this,SignUp::class.java))

        }








    }
}