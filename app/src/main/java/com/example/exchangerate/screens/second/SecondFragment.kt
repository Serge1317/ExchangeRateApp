package com.example.exchangerate.screens.second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.exchangerate.R
import kotlinx.android.synthetic.main.fragment_second.view.*


class SecondFragment : Fragment() {

    private val model: SecondFragmentModel by lazy{
        ViewModelProvider(this)[SecondFragmentModel::class.java];
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false);
        val adapter = SecondFragmentAdapter();
        view.recycler_second_fragment.adapter = adapter;
        model.updateByCardList();
        model.byCardList.observe(viewLifecycleOwner){list ->
            list.body()?.let{
                adapter.setList(it)
            }
        }
        return view;
    }

}