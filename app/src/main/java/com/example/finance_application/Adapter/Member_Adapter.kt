package com.example.finance_application.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.finance_application.Model.Member_Model
import com.example.finance_application.R
import com.example.finance_application.View_member

import android.widget.Toast

class Member_Adapter(private val mlist: List<Member_Model>) : RecyclerView.Adapter<Member_Adapter.MemberviewHolder>() {
    private lateinit var mlistener: onclicklistener
    private lateinit var mlistener1: onclicklistener1

    interface onclicklistener {
        fun onItemclick(position: Int)
    }
    interface onclicklistener1 {
        fun onItemclick1(position: Int)
    }
    fun setonitemclicklistener1(listener1: onclicklistener1) {
        mlistener1 = listener1
    }
    fun setonitemclicklistener(listener: onclicklistener) {
        mlistener = listener
    }


    class MemberviewHolder(Itemview: View, listener: onclicklistener,listener1: onclicklistener1) : RecyclerView.ViewHolder(Itemview) {
        val name_member: TextView = Itemview.findViewById(R.id.mem_name)
        val view_member: Button = Itemview.findViewById(R.id.View_member)
        val edit_member: Button = Itemview.findViewById(R.id.Edit_Member_Btn)

        init {
           view_member.setOnClickListener {
                listener.onItemclick(adapterPosition)
            }
            edit_member.setOnClickListener {
                listener1.onItemclick1(adapterPosition)
            }

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberviewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.member_recycler, parent, false)
        return MemberviewHolder(view, mlistener,mlistener1)
    }

    override fun onBindViewHolder(holder: MemberviewHolder, position: Int) {
        val data = mlist[position]
        holder.name_member.text = data.Name_Member



    }

    override fun getItemCount(): Int {

        return mlist.size
    }
}