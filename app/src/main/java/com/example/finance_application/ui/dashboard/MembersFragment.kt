package com.example.finance_application.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.finance_application.R
import com.example.finance_application.View_member

class MembersFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_members, container, false)

        var Edit_member:Button=root.findViewById(R.id.Edit_Member_Btn)

        Edit_member.setOnClickListener {
            startActivity(Intent(context,com.example.finance_application.Edit_member::class.java))
        }
        var view_mem:Button=root.findViewById(R.id.View_member)

        view_mem.setOnClickListener {
            startActivity(Intent(context,View_member::class.java))
        }
        return root
    }
}