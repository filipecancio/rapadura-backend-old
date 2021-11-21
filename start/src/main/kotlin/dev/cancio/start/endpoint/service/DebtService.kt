package dev.cancio.start.endpoint.service

import dev.cancio.core.model.Debt
import dev.cancio.core.repository.DebtRepository
import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Service

@Service
@Slf4j
class DebtService(
    val debtRepository: DebtRepository
) {
    fun list(pageable: org.springframework.data.domain.Pageable): Iterable<Debt> = debtRepository.findAll(pageable)
}