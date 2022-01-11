package br.com.blz.buybox.usecase

import br.com.blz.buybox.domain.Advertisement
import br.com.blz.buybox.domain.Buybox

interface BuyboxRules {

    fun execute(sku:String, advertisements: Set<Advertisement>) : Buybox
}