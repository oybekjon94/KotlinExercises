package list

import string.startWithT

//multiple filter conditions
fun main(){
    val words = listOf("falcon","cup","wood","tree","top","car","rock",
        "cloud","new","rain")

    val res = words.filter { e -> e.startsWith("w") || e.startsWith("c") }
    println(res)

    val res2 = words.filter { e -> e.startsWith("f") && e.contains("o") }
    println(res2)
}