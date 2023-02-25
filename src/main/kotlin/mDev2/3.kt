package mDev2

//extension and high-order functions
//kengaytma va yuqori darajali func
/*
1.extension func
2.high order func
3.infix func
4.inline func
 */
//extensionni vazifasi bir func ni qayta qayta ishlatish
/*
fun main(){
    val myObject = Masalan()
    myObject.something() //classni ichidagi func chaqirmoq

}
class Masalan{
    fun something(){
        println("hello world")
    }
}
 */
fun main(){
    val myObject = "hello"
    print(myObject.double())
}
fun String.double():String{
    return this + this
}