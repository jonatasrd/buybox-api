package br.com.blz.buybox.infraestructure.http.routing

import br.com.blz.buybox.component.SearchBuyBox
import br.com.blz.buybox.infraestructure.http.request.response.toBuyBoxResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/buybox")
class BuyBoxController(
    val searchBuyBox: SearchBuyBox
) {

    @GetMapping("/{sku}")
    fun getBySku(@PathVariable sku: String) = searchBuyBox.bySku(sku).toBuyBoxResponse()
}
