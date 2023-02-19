package practice2

// kotlin matches and containsMatchIn method
fun main(){
    val words = listOf("book","bookworm","bible","bookish",
    "cookbook","bookstore","pocketbook")

    val pattern = "book".toRegex()

    println("*****************")
    println("containsMatchIn function")

    words.forEach{ word ->
        if (pattern.containsMatchIn(word)){
            println("$word matches")
        }
    }

    println("*************")
    println("matches function")

    words.forEach{ word ->
        if (pattern.matches(word)){
            println("$word matches")
        }
    }
}