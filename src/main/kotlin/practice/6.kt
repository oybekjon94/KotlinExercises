package practice

import java.time.DayOfWeek
import java.time.LocalDate

fun main(){
//    val numbers = IntArray(5)
//
//    numbers[0] = 3
//    numbers[1] = 2
//    numbers[2] = 5
//    numbers[3] = 6
//    numbers[4] = 1
//
//    val len  = numbers.size
//
//    for (i in 0 until  len){
//        println(numbers[i])
//    }
    //----------------------------

//    val dayOfWeek = 3
//
//    when(dayOfWeek) {
//        1-> println("monday")
//        2-> println("tuesday")
//        3-> println("wednesday")
//        4-> println("thursday")
//        5-> println("friday")
//        6-> println("saturday")
//        7-> println("sunday")
//        else -> println("invalid day")
//    }
    //-------------------------
//    val dayOfWeek = 5
//
//    when(dayOfWeek){
//        1,2,3,4,5-> println("weekday")
//        6,7 -> println("weekend")
//        else-> println("wrong value")
//    }
    //--------------------
    val dayOfWeek: DayOfWeek = LocalDate.now().dayOfWeek

    val msg:String = when (dayOfWeek){
        DayOfWeek.MONDAY -> "it's is monday"
        DayOfWeek.TUESDAY -> "it's is tuesday"
        DayOfWeek.WEDNESDAY -> "it's is wednesday"
        DayOfWeek.THURSDAY -> "it's is thursday"
        DayOfWeek.FRIDAY -> "it's is friday"
        DayOfWeek.SATURDAY -> "it's is saturday"
        DayOfWeek.SUNDAY -> "it's is sunday"
        else ->"invalid day of week"
    }
    println(msg)
}