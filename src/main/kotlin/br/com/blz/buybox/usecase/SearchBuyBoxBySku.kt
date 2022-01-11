package br.com.blz.buybox.usecase

import br.com.blz.buybox.domain.SearchContext
import org.springframework.stereotype.Service

@Service
class SearchBuyBoxBySku(
    val searchAdvertisementsBySku: SearchAdvertisementsBySku,
    val buyBoxRules: BuyBoxProcessors
) : UseCase<SearchContext> {

    override fun execute(context: SearchContext) {

        //get advertisements
        searchAdvertisementsBySku.execute(context)

        //process rules to setup buybox
        buyBoxRules.execute(context)
    }

}