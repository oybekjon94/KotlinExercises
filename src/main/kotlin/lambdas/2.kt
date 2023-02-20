package lambdas

fun main(){
    val list = listOf('a','b','c','d')
    val result =
        list.map({ "[${it.toUpperCase()}]"})
    println(result)

    val list2 = listOf(9,11,23,32)
    list2.joinToString(" "){ "[$it]"}
    println(list2)
}