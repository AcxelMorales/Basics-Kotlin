package com.example.testkotlin.enums

enum class Semaforo {

    VERDE { override fun cambiar(): Semaforo = AMARILLO },
    AMARILLO { override fun cambiar(): Semaforo = ROJO },
    ROJO { override fun cambiar(): Semaforo = VERDE };

    abstract fun cambiar(): Semaforo

}
