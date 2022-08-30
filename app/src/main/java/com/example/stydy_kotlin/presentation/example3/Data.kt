package com.example.stydy_kotlin.presentation.example3

import com.example.stydy_kotlin.presentation.example3.Data.Companion.FORMAT_DATE_TIME
import java.text.SimpleDateFormat
import java.time.Period
import java.util.*

fun main(){
    //**преобразовать время в формате String в timestamp**/
    val date = SimpleDateFormat("dd-MM-yyyy").parse("14-02-2018")
    println(date.time / 1000)

    //**Преобразование из string в Data**/
    val formatter = SimpleDateFormat("yyyy-MM-dd")
    val text = "2022-01-06"
    val date2 = formatter.parse(text)
    println(date2)

    val c: Calendar = Calendar.getInstance()
    //**Преобразование из string в Data**/
    var dataTime: Date = SimpleDateFormat(FORMAT_DATE_TIME).parse("09.08.2022 17:13:39")
    //**Получить timestamp из Data**/
    println("oldData ${dataTime.time / 1000}")
    var timestamp = dataTime.time / 1000
    c.time = dataTime
    c.add(Calendar.MINUTE, 40)
    val newData = c.time
    println(newData)
    val newDataTimestamp = newData.time / 1000
    println("newDataTimestamp $newDataTimestamp")
    //Преобразование из Data в String
    val newTime = SimpleDateFormat(FORMAT_DATE_TIME).format(dataTime)
    println(newTime)

    if (kotlin.math.abs(timestamp - newDataTimestamp) <= 1800){
        println("Время еще не вышло")
    }

}

class Data {
    companion object {
        const val FORMAT_DATE_TIME = "dd.MM.yyyy HH:mm:ss"
        const val FORMAT_DATE = "dd.MM.yyyy"
        const val FORMAT_TIME = "HH:mm:ss"

    }
}