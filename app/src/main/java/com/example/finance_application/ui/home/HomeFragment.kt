package com.example.finance_application.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.comix.rounded.RoundedCornerImageView
import com.example.finance_application.New_member
import com.example.finance_application.Profile
import com.example.finance_application.R

class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_home, container, false)
           var Add_mem:RoundedCornerImageView=root.findViewById(R.id.Add_member)
        var profile:RoundedCornerImageView=root.findViewById(R.id.Profile_icon)

        profile.setOnClickListener {
            startActivity(Intent(context,Profile::class.java))
        }

         var activity_btn:Button=root.findViewById(R.id.Activity)

        activity_btn.setOnClickListener {
            startActivity(Intent(context,Profile::class.java))
        }

        Add_mem.setOnClickListener {
            startActivity(Intent(context,New_member::class.java))
        }
        return root
    }
}