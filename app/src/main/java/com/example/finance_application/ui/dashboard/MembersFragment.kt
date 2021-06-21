package com.example.finance_application.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.comix.rounded.RoundedCornerImageView
import com.example.finance_application.Adapter.Member_Adapter
import com.example.finance_application.Model.Member_Model
import com.example.finance_application.Profile
import com.example.finance_application.R
import com.example.finance_application.View_member

class MembersFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_members, container, false)
        var profile: RoundedCornerImageView =root.findViewById(R.id.Profile_icon)

        profile.setOnClickListener {
            startActivity(Intent(context, Profile::class.java))
        }
        var recycler_mem:RecyclerView=root.findViewById(R.id.member_recyclerview)
        recycler_mem.layoutManager=LinearLayoutManager(context)
        val data = ArrayList<Member_Model>()
        for (i in 1..20) {
            data.add(Member_Model("MANISH"+i,213232323,"ADCDSW","1212","12,000","433","1212"))
        }
        val adapter=Member_Adapter(data)
        recycler_mem.adapter=adapter
        adapter.setonitemclicklistener(object :Member_Adapter.onclicklistener{
            override fun onItemclick(position: Int) {

            }

        })



//        var Edit_member:Button=root.findViewById(R.id.Edit_Member_Btn)
//
//        Edit_member.setOnClickListener {
//            startActivity(Intent(context,com.example.finance_application.Edit_member::class.java))
//        }
//        var view_mem:Button=root.findViewById(R.id.View_member)
//
//        view_mem.setOnClickListener {
//            startActivity(Intent(context,View_member::class.java))
//        }
        return root
    }
}