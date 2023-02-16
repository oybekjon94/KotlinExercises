package list

//kotlin filter objects]
data class Car(val name:String, val price: Int)
fun main(){
    val vals = listOf(
        Car("Audi", 42642), Car("Mercedes", 87127),
        Car("Skoda", 90000), Car("Volvo",290000)
    )
    val res =  vals.filter { e -> e.name.startsWith("Vo") }
    println(res)

    val res2 = vals.filter { e -> e.price in 9001..49999 }
    println(res2)

}