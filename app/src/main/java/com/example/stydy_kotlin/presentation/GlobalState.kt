package com.example.stydy_kotlin.presentation

interface GlobalState {

    interface Mapper<T> {
        fun mapGlobalState(first: Double, second: Double, third: Double): T
    }

    class Base(
        private val a: Double,
        private val b: Double,
        private val first: Double,
        private val second: Double,
        private val third: Double
    ): GlobalState {
        fun <T> map(mapper: Mapper<T>): T {
            return mapper.mapGlobalState(first, second, third)
        }
    }
}