package com.example.stydy_kotlin.presentation.LearningMapping

/**
 * Возвращаем этот тип, внутри него маппер, реализация которого вытащит отсюда данные
 */
data class CriticalPoints(private val first: Double, private val second: Double, private val third: Double) {
    interface Mapper<T>{
        fun mapCriticalPoints(first: Double, second: Double, third: Double): T
    }

    fun <T>mapCriticalPoints(mapper: Mapper<T>): T {
        return mapper.mapCriticalPoints(first, second, third)
    }

}