package com.example.exchangerate.data.api

import com.example.exchangerate.model.ItemMoneyList
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("p24api/pubinfo?json&exchange&coursid=5")
    suspend fun getCashMoney(): Response<ItemMoneyList>

    @GET("p24api/pubinfo?exchange&json&coursid=11")
    suspend fun getByCardMoney(): Response<ItemMoneyList>
}


