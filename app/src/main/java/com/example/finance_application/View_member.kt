package com.example.finance_application

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class View_member : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_member)
        var edit_form:Button=findViewById(R.id.Edit_view)
        edit_form.setOnClickListener {
            startActivity(Intent(baseContext,Edit_member::class.java))
        }
    }
}