package com.example.stydy_kotlin.presentation.example2

import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

class MainExample2 {

    suspend fun <T> Operation<T>.perform(): T =
        suspendCoroutine { continuation ->
            performAsync { value, exception ->
                when {
                    exception != null -> // ошибка операции
                        continuation.resumeWithException(exception)
                    else -> // успешно, есть значение
                        continuation.resume(value as T)
                }
            }
        }

}