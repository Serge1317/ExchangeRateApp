package com.example.exchangerate.model

/**
 * @param base_ccy is national currency
 */

data class ItemMoney(
     val ccy: String,
     val base_ccy: String,
     val buy: String,
    val sale: String
) {
}