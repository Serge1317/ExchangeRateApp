package com.example.exchangerate

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.exchangerate.data.repository.Repository
import com.example.exchangerate.model.ItemMoneyList
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response

object App: Application(){

    private val repository = Repository();
    val byCardList: MutableLiveData<Response<ItemMoneyList>> = MutableLiveData();
    val cashList: MutableLiveData<Response<ItemMoneyList>> = MutableLiveData();

    fun updateByCardList(){
        CoroutineScope(Dispatchers.Main).launch{
            byCardList.value = repository.getRate(1);
        }
    }

    fun updateCashList(){
        CoroutineScope(Dispatchers.Main).launch{
            cashList.value = repository.getRate(0);
        }
    }
}