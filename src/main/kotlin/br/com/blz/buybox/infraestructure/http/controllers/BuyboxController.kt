package br.com.blz.buybox.infraestructure.http.controllers

import br.com.blz.buybox.usecase.FindBuyboxBySkuUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/buybox")
class BuyboxController(
    val findBuyboxBySkuUseCase: FindBuyboxBySkuUseCase
) {

    @GetMapping("/{sku}")
    fun getBySku(@PathVariable sku: String) = findBuyboxBySkuUseCase.execute(sku)
}
