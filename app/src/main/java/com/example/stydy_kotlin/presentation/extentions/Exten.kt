package com.example.stydy_kotlin.presentation.extentions

open class Shape

class Circle: Shape()

fun Shape.printType() {
    println("Shape")
}

fun Circle.printType() {
    println("Circle")
}

fun main() {
    val shape: Shape = Circle()
    shape.printType() // Output: "Shape"
}