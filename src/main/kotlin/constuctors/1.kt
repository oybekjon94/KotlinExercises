package constuctors

import java.util.*

fun main(){
    val programmer = Person("Oybek")
    programmer.describeYourself()
}
class Person(private var name:String,private var age: Int){
    init {
        println("Person $name was created")
    }
    constructor(name:String): this(name, Random().nextInt()){
        println("Secondary constructor was invoked")
    }
    fun describeYourself() = println("My name is $name and I am $age years old")
}