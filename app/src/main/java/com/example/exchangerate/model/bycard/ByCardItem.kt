package com.example.exchangerate.model.bycard

data class ByCardItem(
    val ccy: String,
    val base_ccy: String,
    val buy: String,
    val sale: String
)
