package practice

import kotlin.random.Random

fun main(){
    val a = Array(10) { Random.nextInt(0, 100)}
    println(a.joinToString ())
}