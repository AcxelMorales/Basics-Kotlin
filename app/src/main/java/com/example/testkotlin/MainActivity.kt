package com.example.testkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import com.example.testkotlin.clases.Cientifica
import com.example.testkotlin.clases.SmartPhone3

import com.example.testkotlin.enums.Semaforo

import com.example.testkotlin.objects.Think

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mobile = SmartPhone3("Samsung", "S3")
        Log.d("MOBILE", "${mobile.fabricate} - ${mobile.model}")

        var calc = Cientifica()
        Log.e("RESULTADO", "${calc.suma(1, 1)}")
        Log.e("RESULTADO", "${calc.resta(5, 2)}")
        Log.e("RESULTADO", "${calc.multiplicar(2, 5)}")

        var semaforo = Semaforo.VERDE

        if (semaforo == Semaforo.AMARILLO || semaforo == Semaforo.ROJO) {
            Log.e("VALOR", "Frenar")
        } else {
            Log.e("VALOR", "Acelera")
        }

        semaforo = Semaforo.VERDE.cambiar()
        Log.d("SEMAFORO", "$semaforo")

        Think.miFuncion()
    }

}
