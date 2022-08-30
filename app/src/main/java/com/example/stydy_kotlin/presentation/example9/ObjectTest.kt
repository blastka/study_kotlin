package com.example.stydy_kotlin.presentation.example9

fun main(){
    var ob = object {
        var a = 10

        @JvmName("getA1")
        fun getA(): Int{
            return a
        }
    }
    println(ob.getA())
}


class ObjectTest {
}