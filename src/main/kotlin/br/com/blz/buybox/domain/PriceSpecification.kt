package br.com.blz.buybox.domain

import java.math.BigDecimal

data class PriceSpecification(
    val price: BigDecimal = BigDecimal.ZERO,
    val discount: BigDecimal
)
