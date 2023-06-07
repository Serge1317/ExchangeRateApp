package com.example.exchangerate.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.exchangerate.data.repository.Repository
import com.example.exchangerate.model.ItemMoneyInterface
import com.example.exchangerate.model.bycard.ByCard
import com.example.exchangerate.model.bycard.ByCardItem
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondFragmentModel: ViewModel() {
    val repo = Repository();
    val byCardList: MutableLiveData<Response<ByCard>> = MutableLiveData();

    fun updateByCardList(){
        viewModelScope.launch{
            byCardList.value = repo.getByCardRate();
        }
    }
}