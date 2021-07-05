package com.example.finance_application

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.method.TextKeyListener.clear
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.VolleyError
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class Sign_Up : AppCompatActivity() {
    var emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign__up)

        var terms: TextView = findViewById(R.id.Terms_condition_form)
        var email_sign: EditText = findViewById(R.id.SignUp_EmailAddress)
        var name_sign: EditText = findViewById(R.id.SignUp_Name)
        var phone_sign: EditText = findViewById(R.id.SignUp_Phone)
        var password_sign: EditText = findViewById(R.id.SignUp_Password)
        var confirm_Password: EditText = findViewById(R.id.SignUp_Confirm_Password2)
        var Sign_uP: Button = findViewById(R.id.Sign_Up)
        Sign_uP.setOnClickListener {
            //email_validation(email_sign,name_sign,phone_sign,password_sign,confirm_Password,name_sign)

            if((confirm_Password.text.toString()).equals(password_sign.text.toString())){
                Register(email_sign,name_sign,phone_sign,password_sign,confirm_Password,name_sign)
                clear(email_sign, name_sign, phone_sign, password_sign, confirm_Password, name_sign)
            }
            else
            {
                confirm_Password.setError("Password Doesn't match")
            }


        }

        terms.setOnClickListener {
            startActivity(Intent(baseContext, Terms_Condition::class.java))
        }

    }

    private fun clear(
        emailSign: EditText,
        nameSign: EditText,
        phoneSign: EditText,
        passwordSign: EditText,
        confirmPassword: EditText,
        nameSign1: EditText
    ) {
        emailSign.setText("")
        nameSign.setText("")
        phoneSign.setText("")
        passwordSign.setText("")
        confirmPassword.setText("")
    }

    private fun Register(
        emailSign: EditText,
        nameSign: EditText,
        phoneSign: EditText,
        passwordSign: EditText,
        confirmPassword: EditText,
        nameSign1: EditText
    ) {
        val url = "http://loan-debt.kalpvaig.com:8006/user/registration"
//        val retrofit = Retrofit.Builder()
//            .baseUrl(url)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
        val ahOBJ = JSONObject()
        ahOBJ.put("username", nameSign.text.toString())
        ahOBJ.put("email", emailSign.text.toString())
        ahOBJ.put("phone_number", phoneSign.text.toString())
        ahOBJ.put("password", passwordSign.text.toString())

        val queue = Volley.newRequestQueue(this)

        val ahReq = JsonObjectRequest(Request.Method.POST, url, ahOBJ, Response.Listener { response ->
            val str = response.toString()
            Log.d("TAG", "response: $str")
            Toast.makeText(this, "Sucessfull", Toast.LENGTH_LONG).show()
        }, Response.ErrorListener { error ->
            Log.d("TAG", "response: ${error.message}")
            Toast.makeText(this, "Failed", Toast.LENGTH_LONG).show()
        })

// Add the request to the RequestQueue.
        queue.add(ahReq)
    }


}

//    private fun email_validation(
//        email: EditText,
//        password: EditText,
//        phone_sign: EditText,
//        password_sign: EditText,
//        confirm_Password: EditText,
//        name_sign: EditText
//    ) {
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
//        if (phone_sign.text.toString().isEmpty()) {
//            Toast.makeText(applicationContext, "enter phone", Toast.LENGTH_SHORT).show()
//        }
//        if (password_sign.text.toString().isEmpty()) {
//            Toast.makeText(applicationContext, "enter password", Toast.LENGTH_SHORT).show()
//        }
//        if (name_sign.text.toString().isEmpty()) {
//            Toast.makeText(applicationContext, "enter Name", Toast.LENGTH_SHORT).show()
//        }
//
//    }
