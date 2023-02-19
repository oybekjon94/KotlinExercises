package practice2

//split function
fun main(){
    val text = "I saw a fox in the wood. The fox had red fur"

    val pattern = "\\W+".toRegex()
    val words = pattern.split(text).filter { it.isNotBlank() }

    println(words)
}