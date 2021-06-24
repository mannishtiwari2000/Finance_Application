package com.example.finance_application

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class View_member : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_member)
        var edit_form:Button=findViewById(R.id.Edit_view)

        var add_mem:ImageButton=findViewById(R.id.imageButton_add_Button)
        add_mem.setOnClickListener {
            startActivity(Intent(baseContext,Add_More::class.java))
        }

        edit_form.setOnClickListener {
            startActivity(Intent(baseContext,Edit_member::class.java))
        }
    }
}