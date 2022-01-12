package br.com.blz.buybox.domain

class SearchContext(
    val sku: String,
    var advertisements: Set<Advertisement> = emptySet(),
    var scores: Set<SellerScore> = emptySet(),
    var buybox: BuyBox = BuyBox()
)

internal fun SearchContext.toSellerNames() = this.advertisements.map { it.seller.name }.toSet()