package com.example.finance_application

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Sign_Up : AppCompatActivity() {
    var emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign__up)

        var terms:TextView=findViewById(R.id.Terms_condition_form)
        var email_sign:EditText=findViewById(R.id.SignUp_EmailAddress)
        var name_sign:EditText=findViewById(R.id.SignUp_Name)
        var phone_sign:EditText=findViewById(R.id.SignUp_Phone)
        var password_sign:EditText=findViewById(R.id.SignUp_Password)
        var confirm_Password:EditText=findViewById(R.id.SignUp_Confirm_Password2)
        var Sign_uP:Button=findViewById(R.id.Sign_Up)
        Sign_uP.setOnClickListener {
            email_validation(email_sign,name_sign,phone_sign,password_sign,confirm_Password,name_sign)
        }

        terms.setOnClickListener {
            startActivity(Intent(baseContext,Terms_Condition::class.java))
        }

    }
    private fun email_validation(
        email: EditText,
        password: EditText,
        phone_sign: EditText,
        password_sign: EditText,
        confirm_Password: EditText,
        name_sign: EditText
    ) {


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

        if (phone_sign.text.toString().isEmpty()) {
            Toast.makeText(applicationContext, "enter phone", Toast.LENGTH_SHORT).show()
        }
        if (password_sign.text.toString().isEmpty()) {
            Toast.makeText(applicationContext, "enter password", Toast.LENGTH_SHORT).show()
        }
        if (name_sign.text.toString().isEmpty()) {
            Toast.makeText(applicationContext, "enter Name", Toast.LENGTH_SHORT).show()
        }

    }
}