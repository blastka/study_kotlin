package com.example.stydy_kotlin.presentation.LearningMapping

/*interface PointsBuilder {
    fun consumeId(type: String)
    fun consumeDataFromDataBase(criticalPointsList: List<CriticalPoints>)
    fun build(): ReadyGlobalStateProbe

    class Base(): ReadyGlobalStateProbeMapperBuilder{
        private val list: MutableList<CriticalPoints> = mutableListOf()
        lateinit var type: TypeDevice
        override fun consumeId(type: TypeDevice) {
            this.type
        }

        override fun consumeDataFromDataBase(criticalPointsList: List<CriticalPoints>) {
            this.list.clear()
            this.list.addAll(criticalPointsList)
        }

        override fun build(): ReadyGlobalStateProbe {
            return ReadyGlobalStateProbe.Base(type, list)
        }

    }
}*/