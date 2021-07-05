package com.example.finance_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

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
//            startActivity(Intent(baseContext,MainActivity::class.java))
//             email_validation(email,password)
            login(email,password)
            clear(email,password)
        }

        Forget_form.setOnClickListener {
            startActivity(Intent(baseContext,Reset_password::class.java))
        }
    }

    private fun login(email: EditText, password: EditText) {
        val url = "http://loan-debt.kalpvaig.com:8006/user/login"
//        val retrofit = Retrofit.Builder()
//            .baseUrl(url)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
        val ahOBJ = JSONObject()

        ahOBJ.put("email", email.text.toString())
        ahOBJ.put("password", password.text.toString())

        val queue = Volley.newRequestQueue(this)

        val ahReq = JsonObjectRequest(Request.Method.POST, url, ahOBJ, Response.Listener { response ->
            val str = response.toString()
            Log.d("TAG","response: $str")
            startActivity(Intent(baseContext,MainActivity::class.java))
            Toast.makeText(this,"Sucessfully Login",Toast.LENGTH_LONG).show()
        }, Response.ErrorListener {
                error ->
            Log.d("TAG","response: ${error.message}")
            Toast.makeText(this,"Failed",Toast.LENGTH_LONG).show()
        })

// Add the request to the RequestQueue.
        queue.add(ahReq)
    }
    private fun clear(
        emailSign: EditText,

        passwordSign: EditText,

    ) {
        emailSign.setText("")

        passwordSign.setText("")

    }


    }

//    private fun email_validation(email: EditText, password: EditText) {
//
//
//        if (email.text.toString().isEmpty()) {
//            Toast.makeText(applicationContext, "enter email address", Toast.LENGTH_SHORT).show()
//        }
//        else {
//            if (email.text.toString().trim { it <= ' ' }.matches(emailPattern.toRegex())) {
//                Toast.makeText(applicationContext, "valid email address", Toast.LENGTH_SHORT).show()
//            }
//            else {
//                Toast.makeText(applicationContext, "Invalid email address", Toast.LENGTH_SHORT).show()
//            }
//        }
//        if (password.text.toString().isEmpty()) {
//            Toast.makeText(applicationContext, "enter password", Toast.LENGTH_SHORT).show()
//        }
//
//
//    }

