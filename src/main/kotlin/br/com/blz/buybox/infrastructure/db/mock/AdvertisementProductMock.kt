package br.com.blz.buybox.infrastructure.db.mock

import br.com.blz.buybox.domain.AdvertisementProduct

object AdvertisementProductMock {

    val perfume = AdvertisementProduct(name = "Perfume", sku = "M001")
    val creme = AdvertisementProduct(name = "Creme", sku = "M002")
    val escova = AdvertisementProduct(name = "Escova", sku = "B001")

}