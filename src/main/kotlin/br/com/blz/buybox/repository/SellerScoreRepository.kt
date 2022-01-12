package br.com.blz.buybox.repository

import br.com.blz.buybox.domain.SellerScore

interface SellerScoreRepository {

    fun getScoresFor(names: Set<String>): Set<SellerScore>

}