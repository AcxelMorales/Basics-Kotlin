package com.example.testkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.testkotlin.clases.Cientifica
import com.example.testkotlin.clases.SmartPhone3

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
    }

}
