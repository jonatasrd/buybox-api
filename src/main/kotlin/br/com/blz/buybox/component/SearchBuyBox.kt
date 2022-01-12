package br.com.blz.buybox.component

import br.com.blz.buybox.domain.SearchContext
import br.com.blz.buybox.usecase.SearchBuyBoxBySku
import org.springframework.stereotype.Service

@Service
class SearchBuyBox(
    private val searchBuyBoxBySku: SearchBuyBoxBySku
) {

    fun bySku(sku: String): SearchContext {

        val searchContext = SearchContext(sku)

        searchBuyBoxBySku.execute(searchContext)

        return searchContext
    }

}