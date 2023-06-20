package com.example.exchangerate.data.repository

import com.example.exchangerate.data.api.RetrofitInstance
import com.example.exchangerate.model.ItemMoneyList
import retrofit2.Response

class Repository {
//    suspend fun getCashRate(): Response<Cash>{
//        return RetrofitInstance.api.getCashMoney();
//    }
//    suspend fun getByCardRate(): Response<ByCard>{
//        return RetrofitInstance.api.getByCardMoney()
//    }
    /**
     * @param flag: for the cash
     */
    suspend fun getRate(flag: Int): Response<ItemMoneyList>{
        return if(flag == 0) RetrofitInstance.api.getCashMoney()
    else RetrofitInstance.api.getByCardMoney();

    }
}