package clasS

/*
Kotlin Inheritance (Subclass and Superclass)
In Kotlin, it is possible to inherit class properties and functions from one class to another. We group the "inheritance concept" into two categories:

subclass (child) - the class that inherits from another class
superclass (parent) - the class being inherited from
 */

//SuperClass
open class MyParentClass{
    val x = 5
}

//SubClass
class MyChildClass: MyParentClass(){
    fun myFunction(){
        println(x) //x is defined in the superClass
    }
}
//create an object of the MyChildClass and call myFunction
fun main(){
    val myObj = MyChildClass()
    myObj.myFunction()

}