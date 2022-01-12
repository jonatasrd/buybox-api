package br.com.blz.buybox.usecase

import br.com.blz.buybox.domain.SearchContext
import br.com.blz.buybox.usecase.processors.BuyBoxProcessors
import org.springframework.stereotype.Service

@Service
class SearchBuyBoxBySku(
    val searchAdvertisementsBySku: SearchAdvertisementsBySku,
    val searchSellersScore: SearchSellersScore,
    val buyBoxProcessors: Set<BuyBoxProcessors>
) : UseCase<SearchContext> {

    override fun execute(context: SearchContext) {

        //get advertisements
        searchAdvertisementsBySku.execute(context)

        //get sellers score
        searchSellersScore.execute(context)

        //process rules to set up buyBox
        buyBoxProcessors.forEach { it.execute(context) }
    }

}