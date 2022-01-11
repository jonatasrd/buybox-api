package br.com.blz.buybox.domain

class SearchContext(
    val sku: String,
    var advertisements: Set<Advertisement> = emptySet(),
    var buybox: BuyBox = BuyBox()
)