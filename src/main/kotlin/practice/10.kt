package practice

fun main(){
    val words = mapOf(
        1 to "sky", 2 to "cup", 3 to "water", 4 to "den",
        5 to "knife", 6 to "earth", 7 to "falcon"
    )
    words.forEach{(_, v) -> println(v) }
}