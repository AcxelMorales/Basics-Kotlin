package com.example.testkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.testkotlin.clases.SmartPhone3

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mobile = SmartPhone3("Samsung", "S3")
        Log.d("MOBILE", "${mobile.fabricate} - ${mobile.model}")
    }

}
