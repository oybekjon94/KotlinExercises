package string

//kotlin string startWith/endsWith
fun main(){
    val words = listOf("thank","boy","tourist","ten",
    "pen","car","marble","sonnet","pleasant","ink",
    "atom")

    val res = words.filter { e -> startWithT(e) }
    println(res)

    val res2 = words.filter { e -> endWithK(e) }
    println(res2)

}

fun endWithK(word: String):Boolean {
    return word.endsWith("k")

}

fun startWithT(word: String): Boolean{
    return word.startsWith("t")
}
