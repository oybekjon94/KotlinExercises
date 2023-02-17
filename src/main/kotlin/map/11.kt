package map

//kotlin sorted map
fun main(){
    val items = mapOf("coins" to 12, "books" to 45,"cups" to 33,"pens" to 2)
    println(items)

    val sortedItems = sortedMapOf("coins" to 12, "books" to 45,"caps" to 33,"pens" to 2)
    println(sortedItems)
}