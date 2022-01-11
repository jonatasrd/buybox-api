package br.com.blz.buybox.usecase

import br.com.blz.buybox.domain.SearchContext
import br.com.blz.buybox.mock.AdvertisementMock
import org.springframework.stereotype.Service

@Service
class SearchAdvertisementsBySku : UseCase<SearchContext> {

    override fun execute(context: SearchContext) {
        context.advertisements = AdvertisementMock.advertisements
            .filter {
                it.advertisementProduct.sku == context.sku
            }.toSet()
    }

}