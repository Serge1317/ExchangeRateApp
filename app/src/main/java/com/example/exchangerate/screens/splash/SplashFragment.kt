package com.example.exchangerate.screens.splash

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.exchangerate.App
import com.example.exchangerate.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashFragment : Fragment() {

    private val app = App;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_splash, container, false)
        CoroutineScope(Dispatchers.Main).launch {
            val isNetwork = checkNetworkConnection()
            if(isNetwork){
                app.updateByCardList();
                app.updateCashList();
                delay(1000)
                Navigation.findNavController(view)
                    .navigate(R.id.action_splashFragment_to_rootFragment);
            }else{
                Navigation.findNavController(view)
                    .navigate(R.id.action_splashFragment_to_noNetworkFragment)
            }
        }
        return view;
    }
    @Suppress("Deprecation")
    private fun checkNetworkConnection(): Boolean{
        val cm = context?.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager;
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            val network = cm.activeNetwork ?: return false;
            val activeNetwork = cm.getNetworkCapabilities(network) ?: return false;
            return when{
                activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true;
                activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true;
                activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true;
                else -> false;
            }
        }else{
            return cm.activeNetworkInfo != null && cm.activeNetworkInfo!!.isConnected;
        }

    }

}