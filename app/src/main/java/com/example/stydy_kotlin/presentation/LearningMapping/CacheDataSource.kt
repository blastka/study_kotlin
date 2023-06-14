package com.example.stydy_kotlin.presentation.LearningMapping

interface DataSource<T> {
    fun getData(): T

    class Critical(): DataSource<CriticalPoints>{
        override fun getData(): CriticalPoints {
            //Что нибудь получим
            return CriticalPoints(26.5, 18.0, 0.0)
        }

    }

    class Measured(): DataSource<MeasurementPoints>{
        override fun getData(): MeasurementPoints {
            return MeasurementPoints(21.5, 15.0, 0.0)//уже не надо
        }

    }
}