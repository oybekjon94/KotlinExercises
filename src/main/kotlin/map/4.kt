package map

// kotlin entries, keys, values
fun main(){
    val items = mapOf("coins" to 12, "books" to 45,"cups" to 2)

    println("entries: " + items.entries)
    println("keys: "+items.keys)
    println("values: "+items.values)
}