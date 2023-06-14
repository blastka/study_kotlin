package com.example.stydy_kotlin.presentation.LearningMapping

import com.example.stydy_kotlin.presentation.GlobalState

class GlobalStateMapper: GlobalState.Mapper<MeasurementPoints> {
    override fun mapGlobalState(first: Double, second: Double, third: Double): MeasurementPoints {
        return MeasurementPoints(first, second, third)
    }
}