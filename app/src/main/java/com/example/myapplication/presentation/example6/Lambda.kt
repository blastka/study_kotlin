package com.example.myapplication

fun main(){
    var lambda = {param: Int -> param * 5}
    var result = lambda.invoke(5)
    println("result $result")
    var lambdaHello = {println("Hello")}
    lambdaHello()
}


