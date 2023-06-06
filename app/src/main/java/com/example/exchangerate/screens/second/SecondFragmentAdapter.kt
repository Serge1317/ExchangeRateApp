package com.example.exchangerate.screens.second

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.exchangerate.R
import com.example.exchangerate.model.bycard.ByCardItem
import kotlinx.android.synthetic.main.item_money_layout.view.*

class SecondFragmentAdapter: RecyclerView.Adapter<SecondFragmentAdapter.SecondFragmentHolder>() {

    var secondList = emptyList<ByCardItem>();

    class SecondFragmentHolder(view: View): RecyclerView.ViewHolder(view){

    }
    override fun onCreateViewHolder(parent: ViewGroup, type: Int): SecondFragmentHolder{
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_money_layout, parent, false);
        return SecondFragmentHolder(view);
    }
    override fun onBindViewHolder(holder: SecondFragmentHolder, position: Int){
        holder.itemView.item_name.text = secondList[position].ccy;
        holder.itemView.item_buy.text = secondList[position].buy;
        holder.itemView.item_sale.text = secondList[position].sale;
    }
    override fun getItemCount(): Int{
        return secondList.size
    }
    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<ByCardItem>){
        secondList = list;
        this.notifyDataSetChanged();
    }
}