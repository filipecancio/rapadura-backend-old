package dev.cancio.rapabase

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RapaBaseApplication

fun main(args: Array<String>) {
    runApplication<RapaBaseApplication>(*args)
}
