package com.example.ud03pa.Ejercicio_01

open class SerVivo(open val edad: Byte) {

    // Devuelve el SerVivo de mayor edad entre this y otro
    open fun mayor(otro: SerVivo): SerVivo { // 'open' se usa para indicar que se puede heredar de esa clase
        return if (this.edad >= otro.edad) this else otro
    }

    // Dos seres vivos son iguales si tienen la misma edad
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SerVivo) return false
        return this.edad == other.edad
    }

    override fun hashCode(): Int {
        return edad.hashCode()
    }

    // Devuelve todos los datos del objeto
    override fun toString(): String {
        return " $edad anios de edad."
    }
}