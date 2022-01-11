package br.com.blz.buybox.usecase

import br.com.blz.buybox.domain.Buybox
import org.springframework.stereotype.Service

@Service
class FindBuyboxBySkuUseCase(
    val findAdvertisementsBySkuUseCase: FindAdvertisementsBySkuUseCase,
    val buyboxRules: BuyboxRules
) {

    fun execute(sku: String): Buybox {

        //get advertisements and other information
        val advertisements = findAdvertisementsBySkuUseCase.execute(sku)

        //apply rules to build buybox
        return buyboxRules.execute(sku, advertisements)
    }

}