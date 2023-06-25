package com.example.exchangerate.screens.first

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.exchangerate.App
import com.example.exchangerate.R
import com.example.exchangerate.screens.BaseFragmentAdapter
import kotlinx.android.synthetic.main.fragment_first.view.*


class FirstFragment : Fragment(R.layout.fragment_first) {

   private val app: App = App;

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = BaseFragmentAdapter()
        view.recycler_first_fragment.adapter = adapter;
        app.cashList.observe(viewLifecycleOwner) { list ->
            list.body()?.let { adapter.setList(it) }
        }
    }
    override fun onResume() {
        super.onResume()
        this.requireActivity().setTitle(R.string.cash_rate);
    }
}