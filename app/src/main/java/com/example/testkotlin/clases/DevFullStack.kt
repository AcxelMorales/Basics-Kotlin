package com.example.testkotlin.clases

import android.util.Log

class DevFullStack: Trabajo {

    override fun salario(): Float {
        return 18500.50f
    }

    override fun equipo(): String {
        return "Facebook"
    }

    override fun sector(): String {
        return  "Tecnología"
    }

    fun dirigirEquipo() {
        Log.d("ACCIÓN", "Manos a la obra")
    }

}
