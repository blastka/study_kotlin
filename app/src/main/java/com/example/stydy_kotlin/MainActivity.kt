package com.example.stydy_kotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.myapplication.presentation.example8.TestGson

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val test = TestGson()
        test.main(applicationContext)

    }

}
