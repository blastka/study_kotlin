package com.example.stydy_kotlin.presentation.list

interface IntList{
    fun <T> map(mapper: Mapper<T>): T

    data class Base(val int: Int): IntList {
        override fun <T> map(mapper: Mapper<T>): T {
            return mapper.map(int)
        }
    }

    interface Mapper<T> {
        fun map(int: Int): T
    }
}

class IntListMapper: IntList.Mapper<List<Numbers>>{
    override fun map(int: Int): List<Numbers> {
        val mutableList = mutableListOf<Numbers>()
        mutableList.add(Int1(int))
        mutableList.add(Int2(int))
        return mutableList
    }

}
