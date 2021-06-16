package com.example.finance_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var Forget_form: TextView =findViewById(R.id.forget_pwd_form)
        var Login_Btn: Button =findViewById(R.id.Login_Btn)

        Login_Btn.setOnClickListener {
            startActivity(Intent(baseContext,MainActivity::class.java))

        }

        Forget_form.setOnClickListener {
            startActivity(Intent(baseContext,Reset_password::class.java))
        }
    }

}