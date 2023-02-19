package practice2

//regex implicit word boundaries
fun main(){
    val content = """
        knbdkjn ggfnng kjfnbn fdnk
        nbkjfng nfgnbf
        gfklnb nkbnb
        fijij jdijjgi   rpjgjg giopdj
        gbfm
    """
    val pattern = "\\w+".toRegex()

    val words = pattern.findAll(content)
    val count = words.count()

    println("there are $count words")

    words.forEach { matchResult ->
        println(matchResult.value)
    }
}