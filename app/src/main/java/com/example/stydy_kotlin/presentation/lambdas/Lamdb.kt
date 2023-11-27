package com.example.stydy_kotlin.presentation.lambdas

class Lamdb {

    private val result = 1

    fun main() {

        val i = 1
        val a = fun(x: Int, y: Int): Int {

            return x + y + result + i
        }
        println( a(2,5))

        val a1 = fun(x: Int, y: Int): Int {

            return x + y + result + i
        }

        val b = { ab: Int -> ab * ab + result + i
        }
        println(b(5))

        val d = d@{ ab: Int ->
            val res = ab * ab + result + i
            if (res > 5)
                return@d
            else res * 5
        }
        println(b(1))
        println(b(5))

        val ints = listOf(-1, 2, 3, -4, 5, -6)
        ints.filter(fun(item) = item > 0)
    }

    fun ret() {
        println("1")
        val b = { ab: Int ->
            ab * ab + result
        }
        println(b(5))
    }
}

fun main() {
    Lamdb().main()
}