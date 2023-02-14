package practice

fun main(){
    val words = mapOf(
        1 to "sky", 2 to "cup",3 to "water", 4 to "den"
    )

    words.forEach{ (k, v) -> println("$k $v") }
    words.forEach{ (_, v) -> println(v) }
}