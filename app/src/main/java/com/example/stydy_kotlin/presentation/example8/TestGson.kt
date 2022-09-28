package com.example.myapplication.presentation.example8

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import android.util.Log
import com.google.gson.Gson
import com.google.gson.GsonBuilder

class TestGson {
    fun main(context : Context) {
        var cat = Cat("Мия", 8)
        val gson = Gson()
        val gsonPreference = gson.toJson(cat)

        val preferences: SharedPreferences = context.getSharedPreferences("SETTINGS_AUTO_SYNC", MODE_PRIVATE)
        val editor = preferences.edit()
        editor.putString("SETTINGS_AUTO_SYNC", gsonPreference)
        editor.apply()

        val preferences2 = context.getSharedPreferences("SETTINGS_AUTO_SYNC2", MODE_PRIVATE)
        val editor2 = preferences2.edit()
        editor2.putString("SETTINGS_AUTO_SYNC2", cat.toString())
        editor2.apply()

        println(preferences.getString("SETTINGS_AUTO_SYNC", ""))
        preferences2.getString("SETTINGS_AUTO_SYNC2", "")
    }
}
