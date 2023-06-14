package com.example.stydy_kotlin.presentation.list

fun main() {
    val listlist = Listlist().test()
}

class Listlist {
    fun test(){
        val list = arrayListOf<IntList>()
        list.add(IntList.Base(1))
        list.add(IntList.Base(2))
        list.add(IntList.Base(3))
        list.add(IntList.Base(4))
        list.add(IntList.Base(5))
        list.add(IntList.Base(6))
        println(list)
        val mapper = IntListMapper()
        var result = list.map {
            it.map(mapper)
        }
        println(result)
        val newResult = result.flatten()
        println(newResult)
    }
}