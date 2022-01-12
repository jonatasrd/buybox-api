package br.com.blz.buybox.usecase.processors

import br.com.blz.buybox.domain.BuyBox
import br.com.blz.buybox.domain.SearchContext
import br.com.blz.buybox.domain.toMerchants
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Service

@Service
@Order(1)
class BuildBuyBox : BuyBoxProcessors {

    override fun execute(context: SearchContext) {

        context.buybox = BuyBox(
            context.advertisements.toMerchants()
        )
    }

}