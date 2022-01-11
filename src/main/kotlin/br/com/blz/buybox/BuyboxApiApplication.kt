package br.com.blz.buybox

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BuyboxApiApplication

fun main(args: Array<String>) {
	runApplication<BuyboxApiApplication>(*args)
}
