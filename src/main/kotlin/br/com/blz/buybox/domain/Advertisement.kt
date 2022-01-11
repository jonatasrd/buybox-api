package br.com.blz.buybox.domain

data class Advertisement(
    val seller: Seller,
    val inventory: Inventory,
    val priceSpecification: PriceSpecification,
    val advertisementProduct: AdvertisementProduct
)

internal fun Advertisement.toMerchant() = Merchant(
    this.seller,
    this.inventory,
    this.priceSpecification
)

internal fun Set<Advertisement>.toMerchants() = this.map { it.toMerchant() }

