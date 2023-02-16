package map

// map size
fun main(){
    val items = mapOf("coins" to 12, "books" to 45,"cups" to 2)

    println("map has ${items.size} items")
    println("map has ${items.count()} items")

    val n = items.count{it.value > 10}
    println("# of values greater that 10: $n")

}