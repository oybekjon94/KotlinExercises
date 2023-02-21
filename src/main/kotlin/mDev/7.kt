package mDev

fun main(){
    for(i in 1..50){
        when{
            i % 3 == 0 -> println("fizz")
            i % 5 == 0 -> println("fuzz")
            else -> println(i)
        }
        //-----------
        println(
            when{
                i % 3 == 0 -> "fizz"
                i % 5 == 0 -> "fuzz"
                else -> i
            }
        )
    }
}