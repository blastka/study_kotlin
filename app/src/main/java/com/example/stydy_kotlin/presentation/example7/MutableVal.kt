package com.example.stydy_kotlin.MutableVal

fun main(){
    val myMutableList = mutableListOf(1, 2, 3, 4, 5)
    //myMutableList = mutableListOf(1, 2, 3, 4, 5) //be error
    var mutableList = mutableListOf(1,2,3)
    println(mutableList)
    mutableList = mutableListOf(1,3,4,5)
    println(mutableList)
    println(myMutableList)
    myMutableList.add(5)
    println(myMutableList)
    myMutableList[2] = 5
    println(myMutableList)

}