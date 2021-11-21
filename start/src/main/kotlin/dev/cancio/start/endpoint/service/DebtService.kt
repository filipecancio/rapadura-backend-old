package dev.cancio.start.endpoint.service

import dev.cancio.start.endpoint.model.Debt
import dev.cancio.start.endpoint.repository.DebtRepository
import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Service

@Service
@Slf4j
class DebtService(
    val debtRepository: DebtRepository
) {
    fun list(pageable: org.springframework.data.domain.Pageable): Iterable<Debt> = debtRepository.findAll(pageable)
}