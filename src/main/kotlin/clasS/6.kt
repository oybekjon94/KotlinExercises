package clasS

//kotlin constructor
//A constructor is like a special function, and it is defined by using
// two parantheses () after the class name. You can specify the properties
// inside of the parantheses (like passing parameters into a regular function).

class Car3(var brand:String, var model:String, var year:Int)

fun main(){
    var c1 = Car3("Kia","kia",  1900)

    println(c1.brand)
    println(c1.model)
    println(c1.year)

}