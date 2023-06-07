package com.example.exchangerate.model

/**
 * @param base_ccy код национальной валюты
 */

interface ItemMoneyInterface {

    abstract val ccy: String
    abstract val base_ccy: String
    abstract val buy: String
    abstract val sale: String
}