package com.example.testkotlin.objects

import android.util.Log

object Think {

    init {
        Log.e("TAG", "SINGLETON")
    }

    fun miFuncion() {
        Log.d("VALUE", "HI !")
    }

}
