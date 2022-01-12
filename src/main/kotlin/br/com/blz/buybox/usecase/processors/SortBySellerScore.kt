package br.com.blz.buybox.usecase.processors

import br.com.blz.buybox.domain.SearchContext
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Service

@Service
@Order(2)
class SortBySellerScore(
    @Value("\${buybox.sort.score}") val shouldUseScore: Boolean = false
) : BuyBoxProcessors {

    val logger: Logger = LoggerFactory.getLogger(javaClass)

    override fun execute(context: SearchContext) {

        when (shouldUseScore) {
            true -> {

                val scores = getSortedScores(context)

                val merchants = context.buybox.merchants

                logger.info("Order before score: ${merchants.map { it.seller.name }}")

                val merchantsScoreSorted = merchants.sortedBy { scores[it.seller.name] }

                context.buybox.merchants = merchantsScoreSorted

                logger.info("Order after score: ${merchantsScoreSorted.map { it.seller.name }}")
            }
            else -> logger.info("Not using sort by SCORE")
        }


    }

    private fun getSortedScores(context: SearchContext) =
        context.scores.sortedByDescending { it.score }
            .map { it.name }
            .withIndex()
            .associate { it.value to it.index }

}