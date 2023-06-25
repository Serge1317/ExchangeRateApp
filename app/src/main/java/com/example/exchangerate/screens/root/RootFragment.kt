package com.example.exchangerate.screens.root

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.example.exchangerate.R
import com.example.exchangerate.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_root.view.*


class RootFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_root, container, false)
        view.tabLayout.tabIconTint = null;
        view.view_pager.adapter = ViewPagerAdapter(this.context as FragmentActivity)
        TabLayoutMediator(view.tabLayout, view.view_pager){
            tab, position -> when(position){
                0 -> tab.setIcon(R.drawable.ic_baseline_monetization_on_24)
                1 -> tab.setIcon(R.drawable.ic_baseline_attach_money_24)
            }
        }.attach();
        return view;
    }
}