package com.example.finance_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Login : AppCompatActivity() {
    var emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var Forget_form: TextView =findViewById(R.id.forget_pwd_form)
        var Login_Btn: Button =findViewById(R.id.Login_Btn)
        val email:EditText=findViewById(R.id.username_Login)
        val password:EditText=findViewById(R.id.Password_Login)

        Login_Btn.setOnClickListener {
            startActivity(Intent(baseContext,MainActivity::class.java))
             email_validation(email,password)

        }

        Forget_form.setOnClickListener {
            startActivity(Intent(baseContext,Reset_password::class.java))
        }
    }

    private fun email_validation(email: EditText, password: EditText) {


        if (email.text.toString().isEmpty()) {
            Toast.makeText(applicationContext, "enter email address", Toast.LENGTH_SHORT).show()
        }
        else {
            if (email.text.toString().trim { it <= ' ' }.matches(emailPattern.toRegex())) {
                Toast.makeText(applicationContext, "valid email address", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(applicationContext, "Invalid email address", Toast.LENGTH_SHORT).show()
            }
        }
        if (password.text.toString().isEmpty()) {
            Toast.makeText(applicationContext, "enter password", Toast.LENGTH_SHORT).show()
        }


    }

}