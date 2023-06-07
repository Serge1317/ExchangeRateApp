package com.example.exchangerate.model

data class ItemMoney(
     val ccy: String,
     val base_ccy: String,
     val buy: String,
    val sale: String
) {
}