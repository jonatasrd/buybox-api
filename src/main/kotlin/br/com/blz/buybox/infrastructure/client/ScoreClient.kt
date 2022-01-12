package br.com.blz.buybox.infrastructure.client

import br.com.blz.buybox.infrastructure.client.mock.ScoreMock
import br.com.blz.buybox.repository.SellerScoreRepository
import org.springframework.stereotype.Service

@Service
class ScoreClient : SellerScoreRepository {

    override fun getScoresFor(names: Set<String>) =
        ScoreMock.scores.filter {
            names.contains(it.name)
        }.toSet()
}