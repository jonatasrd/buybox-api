package br.com.blz.buybox.infrastructure.db.mock

import br.com.blz.buybox.repository.AdvertisementRepository
import org.springframework.stereotype.Service

@Service
class AdvertisementsRepositoryMock : AdvertisementRepository {

    override fun getAdvertisementsFor(sku: String) =
        AdvertisementMock.advertisements
            .filter {
                it.advertisementProduct.sku == sku
            }.toSet()
}