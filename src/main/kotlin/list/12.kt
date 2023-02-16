package list

//kotlin negating predicates
fun main(){
    val words = listOf(
        "falcon","cup","wood","tree","top","car","rock",
        "cloud","new","rain"
    )
    val r = words.filterNot { it.length == 3}
    println(r)
}