package practice

fun main(){
    val numbers = listOf(1, 2, 3, 4, 5)
    val sum = numbers.reduce { acc, value -> acc + value }
    println(sum)

    val sanskritString = "\u0905\u092D\u093F\u0915\u093E\u0930\u0940"
    println(sanskritString)

    val emoji = "\uD83D\uDE00"
    println(emoji)

}