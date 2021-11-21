package dev.cancio.core.model

import java.io.Serializable

interface AbstractEntity: Serializable {
    fun getLongId()
}