package range

fun main(){
    val chars = ('a'..'f')
    val it = chars.iterator()

    while (it.hasNext()){
        val e = it.next()
        println(e)
    }
}