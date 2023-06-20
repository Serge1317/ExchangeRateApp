package com.example.exchangerate.screens.second

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.exchangerate.R
import com.example.exchangerate.screens.BaseFragmentAdapter
import kotlinx.android.synthetic.main.fragment_second.view.*


class SecondFragment : Fragment(R.layout.fragment_second) {

    private val model: SecondFragmentModel by lazy {
        ViewModelProvider(this)[SecondFragmentModel::class.java];
    }

    override fun onViewCreated(view: View, bundle: Bundle?) {
        super.onViewCreated(view, bundle);
        val adapter = BaseFragmentAdapter();
        view.recycler_second_fragment.adapter = adapter
        model.updateByCardList();
        model.byCardList.observe(viewLifecycleOwner){list ->
            list.body()?.let{
                adapter.setList(it)
            }
        }
    }

}