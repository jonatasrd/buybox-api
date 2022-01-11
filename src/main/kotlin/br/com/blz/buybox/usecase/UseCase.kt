package br.com.blz.buybox.usecase

interface UseCase<T> {

    fun execute(context: T)
}