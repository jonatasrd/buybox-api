package br.com.blz.buybox.repository

import br.com.blz.buybox.domain.Advertisement

interface AdvertisementRepository {

    fun getAdvertisementsFor(sku: String): Set<Advertisement>

}