package br.com.blz.buybox.infrastructure.db.mock

import br.com.blz.buybox.domain.PriceSpecification
import java.math.BigDecimal

object PriceSpecificationMock {

    val priceOne = PriceSpecification(
        price = BigDecimal.ONE,
        discount = BigDecimal.ZERO
    )

    val priceTwo = PriceSpecification(
        price = BigDecimal.TEN,
        discount = BigDecimal.TEN
    )
}