package dev.cancio.start.endpoint.model

import java.io.Serializable

interface AbstractEntity: Serializable {
    fun getLongId()
}