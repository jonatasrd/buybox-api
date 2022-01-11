package br.com.blz.buybox.mock

import br.com.blz.buybox.domain.Advertisement

object AdvertisementMock {

    private val advertisementOne = Advertisement(
        seller = SellerMock.maxLove,
        inventory = InventoryMock.quantityOne,
        priceSpecification = PriceSpecificationMock.priceOne,
        advertisementProduct = AdvertisementProductMock.perfume
    )

    private val advertisementTwo = Advertisement(
        seller = SellerMock.relax,
        inventory = InventoryMock.quantityTwo,
        priceSpecification = PriceSpecificationMock.priceTwo,
        advertisementProduct = AdvertisementProductMock.perfume
    )

    private val advertisementThree = Advertisement(
        seller = SellerMock.maxLove,
        inventory = InventoryMock.quantityOne,
        priceSpecification = PriceSpecificationMock.priceOne,
        advertisementProduct = AdvertisementProductMock.creme
    )

    private val advertisementFour = Advertisement(
        seller = SellerMock.relax,
        inventory = InventoryMock.quantityTwo,
        priceSpecification = PriceSpecificationMock.priceTwo,
        advertisementProduct = AdvertisementProductMock.creme
    )

    private val advertisementFive = Advertisement(
        seller = SellerMock.boticario,
        inventory = InventoryMock.quantityTwo,
        priceSpecification = PriceSpecificationMock.priceTwo,
        advertisementProduct = AdvertisementProductMock.escova
    )

    val advertisements = setOf(
        advertisementOne,
        advertisementTwo,
        advertisementThree,
        advertisementFour,
        advertisementFive
    )
}