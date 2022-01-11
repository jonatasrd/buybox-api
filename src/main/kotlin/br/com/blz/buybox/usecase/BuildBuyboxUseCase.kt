package br.com.blz.buybox.usecase

import br.com.blz.buybox.domain.Advertisement
import br.com.blz.buybox.domain.Buybox
import br.com.blz.buybox.domain.toMerchants
import org.springframework.stereotype.Service

@Service
class BuildBuyboxUseCase : BuyboxRules {

    override fun execute(sku: String, advertisements: Set<Advertisement>): Buybox =
        Buybox(
            sku,
            advertisements.toMerchants()
        )

}