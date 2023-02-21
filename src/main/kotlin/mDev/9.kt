package mDev

fun main(){
    var a = 0
    for (i in 0 until 10){
        var j = 0
        while (j <= 5){
            a++
            j++
        }
    }
    println(a)
}