package clasS

import kotlin.math.cbrt

class Car2(){
    var brand = ""
    var model = ""
    var year = 0
}
fun main(){
    val c1 = Car2()
    c1.brand = "Lasetti"
    c1.model = "Chevrolet"
    c1.year = 2005

    val c2 = Car2()
    c2.brand = "Kia Morning"
    c2.model = "Kia"
    c2.year = 2010

    println("first car name is ${c1.brand}, model is ${c1.model} and year is${c1.year}")
    println("first car name is ${c2.brand}, model is ${c2.model} and year is${c2.year}")
}