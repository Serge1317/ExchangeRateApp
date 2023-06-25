package com.example.exchangerate.data.repository

import com.example.exchangerate.data.api.RetrofitInstance
import com.example.exchangerate.model.ItemMoneyList
import retrofit2.Response

class Repository {
    /**
     * @param flag: for the cash - 0, by card - 1;
     */
    suspend fun getRate(flag: Int): Response<ItemMoneyList>{
        return if(flag == 0) RetrofitInstance.api.getCashMoney()
    else RetrofitInstance.api.getByCardMoney();

    }
}