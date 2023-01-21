package clasS

class Car4(var brand:String, var model:String, var year:Int)

fun main(){
    val c1 = Car4("Nexia","Chevrolet",1996)
    val c2 = Car4("Tico","Daewoo",1991)
    val c3 = Car4("Malibu","Chevrolet",2020)

    println("brand is ${c1.brand} model is ${c1.model} year is ${c1.year}")
    println("brand is ${c2.brand} model is ${c2.model} year is ${c2.year}")
    println("brand is ${c3.brand} model is ${c3.model} year is ${c3.year}")
}