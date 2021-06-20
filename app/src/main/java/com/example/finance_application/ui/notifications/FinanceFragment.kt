package com.example.finance_application.ui.notifications

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.comix.rounded.RoundedCornerImageView
import com.example.finance_application.Adapter.History_Finance_Adapter
import com.example.finance_application.Adapter.Member_Adapter
import com.example.finance_application.Model.Histroy_finance_Model
import com.example.finance_application.Model.Member_Model
import com.example.finance_application.Profile
import com.example.finance_application.R

class FinanceFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         val root = inflater.inflate(R.layout.fragment_finance, container, false)
        var profile: RoundedCornerImageView =root.findViewById(R.id.Profile_icon)

        profile.setOnClickListener {
            startActivity(Intent(context, Profile::class.java))
        }
        var recycler_history:RecyclerView=root.findViewById(R.id.history_finance_recycler)
        recycler_history.layoutManager=LinearLayoutManager(context)
        val data = arrayListOf<Histroy_finance_Model>()
        for (i in 1..20) {
            data.add(Histroy_finance_Model("MANISH","","MANISH"+i))
        }
        val adapter= History_Finance_Adapter(data)
        recycler_history.adapter=adapter

        val loan = resources.getStringArray(R.array.Loan_Value)
        val Loan: Spinner =root.findViewById(R.id.spinner_statistics)
        val adapter1 = this.activity?.let {
            ArrayAdapter(
                it,
                android.R.layout.simple_spinner_dropdown_item, loan)
        }
        // adapter.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Loan.adapter = adapter1

        val Loan1: Spinner =root.findViewById(R.id.spinner_Activity)
        val adapter2 = this.activity?.let {
            ArrayAdapter(
                it,
                android.R.layout.simple_spinner_dropdown_item, loan)
        }
        // adapter.setDropDownViewResource(R.layout.spinner_dropdown_item)
        Loan1.adapter = adapter2

        return root
    }
}