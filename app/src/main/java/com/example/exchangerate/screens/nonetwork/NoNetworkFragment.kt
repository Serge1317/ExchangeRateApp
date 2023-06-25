package com.example.exchangerate.screens.nonetwork

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.Navigation
import com.example.exchangerate.R
import kotlinx.android.synthetic.main.fragment_no_network.*

class NoNetworkFragment : Fragment(R.layout.fragment_no_network) {
        override fun onViewCreated(view: View, bundle: Bundle?){
                no_network_button.setOnClickListener{
                        Navigation.findNavController(view)
                                .navigate(R.id.action_noNetworkFragment_to_splashFragment);
                }
        }

}