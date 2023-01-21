package clasS

class Car(){
    var brand = ""
    var model = ""
    var year = 0
}
fun main(){
    val c1 = Car()
    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969

    println(c1.brand)
    println(c1.model)
    println(c1.year)
}