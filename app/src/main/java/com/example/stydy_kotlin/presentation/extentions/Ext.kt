package com.example.stydy_kotlin.presentation.extentions

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}


fun main() {
    val list = mutableListOf(1, 2, 3)
    list.swap(0, 2) // 'this' inside 'swap()' will hold the value of 'list'
}