package br.com.blz.buybox.infrastructure.client.mock

import br.com.blz.buybox.domain.SellerScore

object ScoreMock {

    private val boticario = SellerScore("boticario", 10)
    private val maxlove = SellerScore("maxlove", 3)
    private val relax = SellerScore("relax", 4)

    val scores = setOf(boticario, maxlove, relax)
}