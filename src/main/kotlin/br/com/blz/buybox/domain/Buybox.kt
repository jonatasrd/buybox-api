package br.com.blz.buybox.domain

data class Buybox(
    val sku: String,
    val merchants: List<Merchant>
)
