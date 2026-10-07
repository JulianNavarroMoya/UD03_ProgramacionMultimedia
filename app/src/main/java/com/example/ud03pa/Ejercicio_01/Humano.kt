package com.example.ud03pa.Ejercicio_01

class Humano(
    override val edad: Byte,
    val nombre: String
) : SerVivo(edad) {

    // Devuelve el humano de mayor edad; en caso de empate, el de nombre más largo
    fun mayor(otro: Humano): Humano {
        return when {
            this.edad > otro.edad -> this
            otro.edad > this.edad -> otro
            else -> {
                if (this.nombre.length >= otro.nombre.length) this else otro
            }
        }
    }

    // Sobrescritura para resolución polimórfica cuando se use desde referencias de tipo SerVivo
    override fun mayor(otro: SerVivo): SerVivo {
        return if (otro is Humano) {
            this.mayor(otro)
        } else {
            super.mayor(otro)
        }
    }

    // Dos humanos son iguales si tienen la misma edad y el mismo nombre
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Humano) return false
        return this.edad == other.edad && this.nombre == other.nombre
    }

    override fun hashCode(): Int {
        var result = edad.hashCode()
        result = 31 * result + nombre.hashCode()
        return result
    }

    // Devuelve todos los datos del objeto Humano (nombre y edad)
    override fun toString(): String {
        return " $nombre con $edad anios de edad."
    }
}