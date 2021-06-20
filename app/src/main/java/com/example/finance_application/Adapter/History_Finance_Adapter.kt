package com.example.finance_application.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.finance_application.Model.Histroy_finance_Model
import com.example.finance_application.R

class History_Finance_Adapter(private  val mlist:List<Histroy_finance_Model>):RecyclerView.Adapter<History_Finance_Adapter.Finance_ViewModel>() {


    class Finance_ViewModel(Itemview: View):RecyclerView.ViewHolder(Itemview){
        var name:TextView=Itemview.findViewById(R.id.Finance_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Finance_ViewModel {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_histroy,parent,false)
return Finance_ViewModel(view)
    }

    override fun onBindViewHolder(holder: Finance_ViewModel, position: Int) {
       var data = mlist[position]
       holder.name.text=data.Finance_Name
    }

    override fun getItemCount(): Int {
      return mlist.size
    }
}