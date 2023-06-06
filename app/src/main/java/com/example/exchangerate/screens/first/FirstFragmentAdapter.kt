package com.example.exchangerate.screens.first

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exchangerate.R
import com.example.exchangerate.model.cash.CashItem
import kotlinx.android.synthetic.main.item_money_layout.view.* //     id 'kotlin-android-extensions' (plugins app module)

class FirstFragmentAdapter : RecyclerView.Adapter<FirstFragmentAdapter.FirstFragmentHolder>() {

    private var listFirst = emptyList<CashItem>();

    class FirstFragmentHolder(view: View) :
        RecyclerView.ViewHolder(view) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstFragmentHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_money_layout, parent, false);
        return FirstFragmentHolder(view);
    }

    override fun onBindViewHolder(holder: FirstFragmentHolder, position: Int) {
        holder.itemView.item_name.text = listFirst[position].ccy
        holder.itemView.item_buy.text = listFirst[position].buy;
        holder.itemView.item_sale.text = listFirst[position].sale;
    }

    override fun getItemCount(): Int {
        return listFirst.size
    }
    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<CashItem>){
        listFirst = list;
        this.notifyDataSetChanged();
    }
}