package practice2

//regex word boundaries
fun main(){
    val text = "this island is beautiful"
    val pattern = "\\bis\\b".toRegex()

    val matches = pattern.findAll(text)

    matches.forEach { m ->
        val v = m.value
        val idx = m.range
        println("$v found at indexes: $idx")
    }
}