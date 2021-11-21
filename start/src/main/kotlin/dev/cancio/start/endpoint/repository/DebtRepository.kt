package dev.cancio.start.endpoint.repository

import dev.cancio.start.endpoint.model.Debt
import org.springframework.data.repository.PagingAndSortingRepository

interface DebtRepository: PagingAndSortingRepository<Debt,Long> {
}