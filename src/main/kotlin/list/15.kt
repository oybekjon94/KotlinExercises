package list

//filtering strings
fun main(){
    val words = listOf("falcon","cup","wood","tree","top","car","rock",
        "cloud","new","rain")
    val res = words.filter { e -> e.length == 3}
    println(res)

    val res2 = words.filter { e -> e.startsWith("w")}
    println(res2)
}