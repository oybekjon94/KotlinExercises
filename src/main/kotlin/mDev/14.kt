package mDev

fun main(){
//    for (i in 1..5){
//        println(fibonacci(i))
//    }
    //same as
    println(fibonacci(5))
}
fun fibonacci(n : Int): Int{
    if (n <= 1){
        return 1
    }
    // aks xolda else ga uxshiydi
    return fibonacci(n -1)+ fibonacci(n-2)
}