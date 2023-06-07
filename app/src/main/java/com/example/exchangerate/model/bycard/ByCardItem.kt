package com.example.exchangerate.model.bycard

import com.example.exchangerate.model.ItemMoneyInterface

data class ByCardItem(
    override val ccy: String,
    override val base_ccy: String,
    override val buy: String,
    override val sale: String
): ItemMoneyInterface
