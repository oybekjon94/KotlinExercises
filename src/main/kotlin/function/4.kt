package function


fun addNumber(n1: Double, n2 :Double): Int{
    val sum = n1 + n2
    val sumInteger = sum.toInt()
    return sumInteger
}

fun main (){
    val number1 = 12.2
    val number2 = 3.4
    val result:Int

    result = addNumber(number1, number2)
    println(result)
}