package br.com.blz.buybox.usecase

import br.com.blz.buybox.mock.AdvertisementMock
import org.springframework.stereotype.Service

@Service
class FindAdvertisementsBySkuUseCase {

    fun execute(sku: String) = AdvertisementMock.advertisements
        .filter {
            it.advertisementProduct.sku == sku
        }.toSet()

}