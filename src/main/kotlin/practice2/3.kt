package practice2

//findAll method
fun main(){
    val text = "I saw a fox in the wood. the fox had red fur."
    val pattern = "fox".toRegex()

    val matches = pattern.findAll(text)

    matches.forEach { f ->
        val m = f.value
        val idx = f.range
        println("$m found at indexe: $idx")
    }
}