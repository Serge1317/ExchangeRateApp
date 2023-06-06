package com.example.exchangerate.screens.first

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.exchangerate.data.repository.Repository
import com.example.exchangerate.model.cash.Cash
import kotlinx.coroutines.launch
import retrofit2.Response

class FirstFragmentModel: ViewModel() {
    val repo = Repository();
    val cashList: MutableLiveData<Response<Cash>> = MutableLiveData();

    fun updateCashList(){
        viewModelScope.launch{
            cashList.value = repo.getCashRate();
        }
    }
}