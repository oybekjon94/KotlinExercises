package array

import kotlin.random.Random

fun main(){
    val vals = Array(10){ Random.nextInt(0, 100)}
    println(vals.joinToString())
}