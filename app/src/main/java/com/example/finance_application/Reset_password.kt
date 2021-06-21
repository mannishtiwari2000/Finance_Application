package com.example.finance_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Reset_password : AppCompatActivity() {
    var emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)
        var Email:EditText=findViewById(R.id.Forget_Email)
        var Reset:Button=findViewById(R.id.Reset_btn)
        Reset.setOnClickListener {
            email_validation(Email)
            startActivity(Intent(baseContext,Login::class.java))
        }
    }
    private fun email_validation(Email: EditText) {


        if (Email.text.toString().isEmpty()) {
            Toast.makeText(applicationContext, "enter email address", Toast.LENGTH_SHORT).show()
        } else {
            if (Email.text.toString().trim { it <= ' ' }.matches(emailPattern.toRegex())) {
                Toast.makeText(applicationContext, "valid email address", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Invalid email address", Toast.LENGTH_SHORT).show()
            }
        }
    }

    }