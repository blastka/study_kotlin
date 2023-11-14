package com.example.stydy_kotlin.presentation.extentions

class MyClass {
    fun printMessage() {
        println("Метод-член")
    }
}

fun MyClass.printMessage() {
    println("Расширяющая функция")
}

fun main() {
    val obj = MyClass()
    obj.printMessage() // Вывод: "Метод-член"
}

