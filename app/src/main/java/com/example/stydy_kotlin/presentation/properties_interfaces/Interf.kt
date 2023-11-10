package com.example.stydy_kotlin.presentation.properties_interfaces

open class Outer {
    private val a = 1
    protected open val b = 2
    internal open val c = 3
    val d = 4  // public by default

    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {
    // a is not visible
    // b, c and d are visible
    // Nested and e are visible

    internal val y = 5
    override val b = 5   // 'b' is protected
    override val c = 7   // 'c' is internal

    fun olyalya(){


        fun byaka(){

        }
        byaka()
    }
}

class Unrelated(o: Outer) {

    // o.a, o.b are not visible
    // o.c and o.d are visible (same module)
    // Outer.Nested is not visible, and Nested::e is not visible either
}

class MyClass {
    private val property = "Hello, World!"

    fun example() {
        // Локальная функция
        fun localFunction() {
            println(property)
        }

// Вызов локальной функции
        localFunction()
    }
}

fun main() {
    val obj = MyClass()
    obj.example() // Вывод: "Hello, World!"
}