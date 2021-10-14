package com.example.testkotlin.clases

class Outer {

    private var anidada: Int = 10

    class Anidada {

        fun funAnidada() {
            var prueba: Int
        }

    }

    inner class Inner {

        fun funInner() {
            var prueba2: Int
            prueba2 = anidada
        }

    }

}
