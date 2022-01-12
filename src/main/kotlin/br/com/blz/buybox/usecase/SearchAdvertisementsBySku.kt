package br.com.blz.buybox.usecase

import br.com.blz.buybox.domain.SearchContext
import br.com.blz.buybox.repository.AdvertisementRepository
import org.springframework.stereotype.Service

@Service
class SearchAdvertisementsBySku(
    val advertisementRepository: AdvertisementRepository
) : UseCase<SearchContext> {

    override fun execute(context: SearchContext) {
        context.advertisements = advertisementRepository.getAdvertisementsFor(context.sku)
    }

}