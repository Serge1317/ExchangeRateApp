package com.example.exchangerate.screens

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exchangerate.R
import com.example.exchangerate.model.ItemMoney
import kotlinx.android.synthetic.main.item_money_layout.view.*

class BaseFragmentAdapter: RecyclerView.Adapter<BaseFragmentAdapter.BaseHolder>() {

    private var list = emptyList<ItemMoney>();

    class BaseHolder(view: View) :
        RecyclerView.ViewHolder(view) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_money_layout, parent, false);
        return BaseHolder(view);
    }

    override fun onBindViewHolder(holder: BaseHolder, position: Int) {
        holder.itemView.item_name.text = list[position].ccy
        holder.itemView.item_buy.text = list[position].buy;
        holder.itemView.item_sale.text = list[position].sale;
    }

    override fun getItemCount(): Int {
        return list.size
    }
    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: ArrayList<ItemMoney>){
        this.list = list;
        this.notifyDataSetChanged();
    }
}