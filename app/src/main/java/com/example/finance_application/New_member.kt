package com.example.finance_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class New_member : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_member)
        val browse:Button=findViewById(R.id.Browse_btn)

        browse.setOnClickListener {
            val intent = Intent()
                .setType("*/*")
                .setAction(Intent.ACTION_GET_CONTENT)

            startActivityForResult(Intent.createChooser(intent, "Select a file"), 111)
        }
        val loan = resources.getStringArray(R.array.Loan_Value)
        val Loan:Spinner=findViewById(R.id.spinner_Loan_Type)
        val adapter = ArrayAdapter(this,
            android.R.layout.simple_spinner_dropdown_item, loan)
       // adapter.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Loan.adapter = adapter
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 111 && resultCode == RESULT_OK) {
            val selectedFile = data?.data //The uri with the location of the file
     //       image_docs.setImageURI(selectedFile)
        }
    }

}