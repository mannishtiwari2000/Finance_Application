package com.example.finance_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Welcome_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page)


        var Login_frm: Button =findViewById(R.id.Login_form)
        Login_frm.setOnClickListener {
            startActivity(Intent(baseContext,Login::class.java))

        }
        var SignUp_form: Button =findViewById(R.id.SignUp_form)
        SignUp_form.setOnClickListener {
            startActivity(Intent(baseContext,Sign_Up::class.java))

        }

    }
   
}