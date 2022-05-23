package com.maau.ejemplomvvm.domain

import com.maau.ejemplomvvm.data.QuoteRepository
import com.maau.ejemplomvvm.data.model.QuoteModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(private val repository: QuoteRepository) {
    suspend operator fun invoke() = repository.getAllQuotes()
}