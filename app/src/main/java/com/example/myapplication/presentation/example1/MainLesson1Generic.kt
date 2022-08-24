package com.example.myapplication.presentation.example1

import android.util.Log

class MainLesson1Generic {
    fun processLesson1(){
        val catMurzik = Cat("Murzik")
        val catVasya = Cat("Vasya")
        val catCiti = Cat("Citi")
        val dogLord = Dog("Lord")
        val dogLessi = Dog("Lessi")
        val fishGold = Fish("Gold")
        val fishBlack = Fish("Black")

        val catContest = Contest<Cat>()
        catContest.addScore(catMurzik, 55)
        catContest.addScore(catCiti, 67)
        catContest.addScore(catVasya, 67)
        val winners = catContest.getWinners()
        winners.forEach {
            Log.e("LESSON1", "winner ${it.name}")
        }

    }

}