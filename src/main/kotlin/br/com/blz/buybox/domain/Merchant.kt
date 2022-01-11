package br.com.blz.buybox.domain

data class Merchant(
    val seller: Seller,
    val inventory: Inventory,
    val priceSpecification: PriceSpecification
)