package com.example.stydy_kotlin.presentation.lambdas

class Person(name: String) {
}

fun Person.(name: String): Int {
    return name.length
}