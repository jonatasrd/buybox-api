package br.com.blz.buybox.usecase

import br.com.blz.buybox.domain.SearchContext
import br.com.blz.buybox.domain.toSellerNames
import br.com.blz.buybox.repository.SellerScoreRepository
import org.springframework.stereotype.Service

@Service
class SearchSellersScore(
    private val sellerScoreRepository: SellerScoreRepository
) : UseCase<SearchContext> {

    override fun execute(context: SearchContext) {
        context.scores = sellerScoreRepository.getScoresFor(context.toSellerNames())
    }

}