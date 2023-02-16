package list

fun main(){
    val vals = listOf(1,2,0,5,-4,5,-6,7,8,3)

    val r = vals.find { e -> isNegative(e) }
    println(r)

}

fun isNegative(e: Int): Boolean {
    return e < 0
}
