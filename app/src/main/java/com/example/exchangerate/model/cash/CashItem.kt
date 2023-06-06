package com.example.exchangerate.model.cash

data class CashItem(
    val ccy: String, // код валюты
    val base_ccy: String, // код национальной валюты
    val buy: String,
    val sale: String
)