package com.example.exchangerate.data.repository

import com.example.exchangerate.data.api.RetrofitInstance
import com.example.exchangerate.model.ItemMoneyInterface
import com.example.exchangerate.model.bycard.ByCard
import com.example.exchangerate.model.bycard.ByCardItem
import com.example.exchangerate.model.cash.Cash
import retrofit2.Response

class Repository {
    suspend fun getCashRate(): Response<Cash>{
        return RetrofitInstance.api.getCashMoney();
    }
    suspend fun getByCardRate(): Response<ByCard>{
        return RetrofitInstance.api.getByCardMoney()
    }
}