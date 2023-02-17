package map

//kotlin map forEach
fun main(){
    val items = mapOf("coins" to 12, "books" to 45,"cups" to 33,"pens" to 2)

    items.forEach{(k,v) -> println("there are $v $k") }
}