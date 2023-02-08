package string

fun main(){
    val word = "eagle,falcon,hawk,owl"

    val birds = word.split(",")

    birds.forEach(::println)
}