package com.example.testkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Tipo de datos

        var name: String = "Acxel"
        var age: Int = 24
        var number: Long = 788171717
        var size: Float = 1.70f
        val pi: Double = 3.14159265 // constant
        var letter: Char = 'a'
        var married: Boolean = false

        // ACEPTAR NULOS

        var okNull: String? = "nulo"
        okNull = null

        // LOGS

        Log.d("VALUE", name)

        // CONDICIONALES

        var option: Int = 2

        when (option) {
            1, 2, 3, 4 -> Log.d("OPT", "El valor es " + option)
            //2 -> Log.d("OPT", "El valor es " + option)
            //3 -> Log.d("OPT", "El valor es " + option)
            //4 -> Log.d("OPT", "El valor es " + option)
            else -> {
                Log.e("ERR", "El nùmero no coincide")
            }
        }

        var optionTwo: Int = 66

        when (optionTwo) {
            in 1..100 -> Log.d("OPT", "El valor es " + optionTwo)
            else -> {
                Log.e("ERR", "El nùmero no coincide")
            }
        }

        var optionTree: Int = 101

        when (optionTree) {
            !in 1..100 -> Log.d("OPT", "El valor " + optionTree + " no esta en el rango de 1 - 100")
            else -> {
                Log.e("ERR", "El nùmero no coincide")
            }
        }

        for (number in 55..66) {
            Log.e("ITEM", "$number")
        }

        var counter: Int = 1

        while (counter <= 10) {
            Log.d("ITEM W", "$counter")
            counter++
        }

        var counterTwo: Int = 1

        do {
            Log.d("ITEM W", "$counterTwo")
            counterTwo++
        } while (counterTwo <= 10)

        // ARRAYS

        var chanels = arrayOf("1", "2", "3", 4, "5", "6")
        chanels.set(2, true)

        for (t in chanels) {
            Log.d("VALUE ARRAY", "$t")
        }

        // ARRAY LIST

        var arrList = ArrayList<String>()
        arrList.add("Hola mundo")
        arrList.add("2")
        arrList.add("false")

        arrList.remove("false")

        arrList.set(0, "Hola mundo en Kotlin")
        Log.d("VALUE ARRLIST", "Chanel ${arrList.get(0)}")
        Log.e("SIZE", "${arrList.size}")

        if (arrList.contains("2")) {
            Log.i("VALUE", "Se encontro valor");
        }

        // MAP

        var map = HashMap<Int, String>()

        map.put(0, "Kotlin")
        map.put(1, "Java")
        map.put(2, "JavaScript")

        Log.d("VALUE MAP", "${map.get(1)}")

        map.put(2, "React Native")

        for (m in map.keys) {
            Log.d("TAG", "${map.get(m)}")
        }
    }

}
