package com.example.stydy_kotlin.presentation.sealed

import java.io.File
import javax.sql.DataSource

sealed interface Error

sealed class IOError(): Error{
    fun pa(){}
}

class FileReadError(val file: File): IOError(){
    fun b() {}
}

class DatabaseError(val source: DataSource): IOError()

object RuntimeError : Error

enum class A: Error{
    FileError
}

sealed class Shape

class Circle(val radius: Double) : Shape()

fun someFunction() {
    // Это неправильно! Класс Square определен как локальный класс
    //class Square(val side: Double) : Shape()
}

sealed class Shape1 {
    abstract fun printShape()
}

fun someFunction1() {
    // Это неправильно!
    /*val square = object : Shape1() {
        override fun printShape() {
            println("This is a square")
        }
    }*/
}