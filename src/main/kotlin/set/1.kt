package set

//kotlin setOf
fun main() {
    val words = setOf("pen", "cup", "dog", "spectacles")
    println("the set contains ${words.size} elements.")

    val words1 = setOf("pen", "cup", "dog","pen","spectacles")
    //words.forEach{ e -> println(e)}
    words1.forEach(::println)
}