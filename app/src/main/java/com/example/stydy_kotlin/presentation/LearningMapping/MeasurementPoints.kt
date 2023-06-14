package com.example.stydy_kotlin.presentation.LearningMapping

class MeasurementPoints(private val first: Double, private val second: Double, private val third: Double) {
    interface Mapper<T>{
        //Пишем, что нужно от этого класса, какие поля
        fun mapMeasurementPoints(first: Double, second: Double, third: Double) : T
    }

    //пишет подстановку, что бы забралось отсюда, при вызове реализованного маппера
    fun <T>mapperMeasurementPoints(mapper: Mapper<T>) : T {
        return mapper.mapMeasurementPoints(first, second, third)
    }
}