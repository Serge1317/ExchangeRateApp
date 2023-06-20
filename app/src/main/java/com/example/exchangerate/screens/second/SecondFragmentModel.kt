package com.example.exchangerate.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.exchangerate.data.repository.Repository
import com.example.exchangerate.model.ItemMoneyList
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondFragmentModel: ViewModel() {
    val repo = Repository();
    val byCardList: MutableLiveData<Response<ItemMoneyList>> = MutableLiveData();

    fun updateByCardList(){
        viewModelScope.launch{
            byCardList.value = repo.getRate(1); // flag 1 for the non cash rate
        }
    }
}