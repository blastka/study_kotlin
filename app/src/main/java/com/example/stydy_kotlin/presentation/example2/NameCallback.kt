package com.example.stydy_kotlin.presentation.example2

interface Operation<T> {
    fun performAsync(callback: (T?, Throwable?) -> Unit)
}