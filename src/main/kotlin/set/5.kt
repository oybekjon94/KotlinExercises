package set

//set iterate
fun main(){
    val words = setOf("pen","cup","dog","person",
        "cement","coal","spectacles","cup","bread")

    words.forEach{ e -> print("$e ") }
    println()

    for (word in words){
        print("$words")
    }
    println()

    for (i in 0 until words.size){
        print("${words.elementAt(i)}")
    }

    println()

    words.forEachIndexed({i, e-> println("$i - $e")})

    val it: Iterator<String> = words.asIterable().iterator()
    while (it.hasNext()){
        val e = it.next()
        print("$e ")
    }
}