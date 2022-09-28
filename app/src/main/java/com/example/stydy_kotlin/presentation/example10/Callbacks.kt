package com.example.stydy_kotlin.presentation.example10

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class Callbacks {
    // создаем колбек и его метод
    interface Callback {
        fun callingBack()
    }

    var callback: Callback? = null

    fun registerCallBack(callback: Callback?) {
        this.callback = callback
    }

    fun doSomething() {
        Log.e("MY", "test")
        // вызываем метод обратного вызова
        callback!!.callingBack()
    }
}