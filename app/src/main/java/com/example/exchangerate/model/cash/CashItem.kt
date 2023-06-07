package com.example.exchangerate.model.cash

import com.example.exchangerate.model.ItemMoneyInterface

data class CashItem(
    override val ccy: String,
    override val base_ccy: String,
    override val buy: String,
    override val sale: String
): ItemMoneyInterface