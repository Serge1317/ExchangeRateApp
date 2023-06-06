package com.example.exchangerate.screens.first

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.exchangerate.R
import kotlinx.android.synthetic.main.fragment_first.view.*


class FirstFragment : Fragment() {

    private val model: FirstFragmentModel by lazy{
        ViewModelProvider(this)[FirstFragmentModel::class.java]
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false);
        val adapter = FirstFragmentAdapter();
        view.recycler_first_fragment.adapter = adapter;
        model.updateCashList();
        model.cashList.observe(viewLifecycleOwner) { list ->
            list.body()?.let { adapter.setList(it) }
        }
        return view;
    }
}