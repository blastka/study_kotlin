package com.example.stydy_kotlin.presentation.properties_interfaces

class Rectangle(private val width: Int, private val height: Int) {
    var area: Int =
        0 // property type is optional since it can be inferred from the getter's return type
        get() = this.width * this.height
        set(value)  {
            field = value * 5}

    var aroun: String = ""
        set(value) {
            value + "dog"
            field = value
        }
}

interface Named {
    val name: String
}

interface Person : Named {
    val firstName: String
    val lastName: String

    override var name: String
        get() = "$firstName $lastName"
        set(value) = println("Новое значение: $value")
}

data class Employee(
    // реализация 'name' не требуется
    override val firstName: String,
    override val lastName: String,
    val position: String
) : Person

interface A {
    fun foo() { print("A") }
    fun bar()
}

interface B {
    fun foo() { print("B") }
    fun bar() { print("bar") }
}

class C : A {
    override fun bar() { print("bar") }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}

fun main() {
    val d = D()
    d.foo()
    val subclass = Subclass()
    subclass.olyalya()
}
