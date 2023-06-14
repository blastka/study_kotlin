package com.example.stydy_kotlin

fun main() {
    /*var lambda = { param: Int -> param * 5 }
    var result = lambda.invoke(5)
    println("result $result")
    var lambdaHello = { println("Hello") }
    lambdaHello()
*/
    val lambda = Lambda()
    val a = lambda.number {
        val a = 5
        val b = 7
        a + b
    }
    println(a)
}

class Lambda {
    fun number(block: () -> Int): Int {
        return block()
    }
}

class Number() {

}


