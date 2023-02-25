package mDev2

class A{
    fun a(){
        println("haha")
    }
}
fun A.a(){
    println("hahaha")
}
fun main(){
    val a = A()
    a.a()
}