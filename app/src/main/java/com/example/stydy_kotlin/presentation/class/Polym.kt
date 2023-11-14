package com.example.stydy_kotlin.presentation.`class`

open class Person(val name: String) {
    open fun printName() {
        println("Person name: $name")
    }
}

class Employee(name: String) : Person(name) {
    override fun printName() {
        println("Employee name: $name")
    }
}

fun main() {
    val person: Person = Employee("John Doe")
    person.printName() //Employee name: John Doe
    val person2: Person = Employee("John Doe")
    person2.printName() //Employee name: John Doe
}

