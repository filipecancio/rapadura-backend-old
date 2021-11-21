package dev.cancio.start.endpoint.controller

import dev.cancio.start.endpoint.model.Debt
import dev.cancio.start.endpoint.service.DebtService
import lombok.extern.slf4j.Slf4j
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.awt.print.Pageable

@RestController
@RequestMapping("v1/cana/debt")
@Slf4j
class DebtController(
    final val debtService: DebtService
) {
    @GetMapping(
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun list(pageable: org.springframework.data.domain.Pageable):ResponseEntity<Iterable<Debt>> = ResponseEntity(debtService.list(pageable),HttpStatus.OK)
}