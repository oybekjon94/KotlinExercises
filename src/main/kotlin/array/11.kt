package array

fun main(){
    val nums = intArrayOf(2,3,4,5,6)
    val words = listOf("car","forest","computer")
    // ASCII
    // Immutable
    var letter = "letter"
    letter  = "word"
    letter.toCharArray()
    // String Builder
    // String Buffer
    val strBuilder = StringBuilder()
    // String Pool

    val result = words.map {
        it.length
    }

    val result2 = words.map(String::length)

    println(result)
    println(result2)

    val total = nums.sum()
    val average = nums.average()
    println(total)
    println(average)
}