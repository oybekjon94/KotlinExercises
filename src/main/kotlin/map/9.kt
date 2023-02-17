package map

//kotlin filter map
fun main(){
    val items = mapOf("A" to 90,"B" to 80,"C" to 70,"D" to 60,"E" to 50)

    val filtered = items.filterKeys { key -> key == "A" || key == "C" }
    println(filtered)

    val filtered2 = items.filterValues { it >= 70 }
    println(filtered2)

    val filtered3 = items.filter { it.key == "A" || it.value == 50 }
    println(filtered3)
}

