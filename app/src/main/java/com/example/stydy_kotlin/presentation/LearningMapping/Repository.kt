package com.example.stydy_kotlin.presentation.LearningMapping

import com.example.stydy_kotlin.presentation.GlobalState

/**
 *
 */
interface Repository {

    class Base(): Repository {
        val globalState = GlobalState.Base(1.0,1.0, 21.5, 15.0, 0.0)
        val criticalDataSource = DataSource.Critical()
        val points = globalState.map(GlobalStateMapper())
        val critical = criticalDataSource.getData()

        //Теперь нужно оба в один метод отдать, или класс (билдер)
    }
}