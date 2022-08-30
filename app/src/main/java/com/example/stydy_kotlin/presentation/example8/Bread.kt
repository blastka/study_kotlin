package com.example.stydy_kotlin.presentation.example8

fun main(){
    val breadFromFrodo = readLine()
    val breadFromSam = readLine()
    val result = totalLembas(breadFromFrodo!!.toInt(), breadFromSam!!.toInt())
    print(result)
}

fun totalLembas(breadFromFrodo: Int, breadFromSam: Int): Int{
    return breadFromFrodo + breadFromSam
}