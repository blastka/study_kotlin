package com.example.myapplication.presentation.example2

interface Operation<T> {
    fun performAsync(callback: (T?, Throwable?) -> Unit)
}