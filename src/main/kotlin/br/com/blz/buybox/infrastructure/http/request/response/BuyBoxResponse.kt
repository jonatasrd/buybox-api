package br.com.blz.buybox.infrastructure.http.request.response

import br.com.blz.buybox.domain.Merchant
import br.com.blz.buybox.domain.SearchContext

data class BuyBoxResponse(
    val sku: String,
    val merchants: List<Merchant>
)

internal fun SearchContext.toBuyBoxResponse() =
    BuyBoxResponse(
        this.sku,
        this.buybox.merchants
    )
