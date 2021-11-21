package dev.cancio.core.repository

import dev.cancio.core.model.Debt
import org.springframework.data.repository.PagingAndSortingRepository

interface DebtRepository: PagingAndSortingRepository<Debt,Long> {
}