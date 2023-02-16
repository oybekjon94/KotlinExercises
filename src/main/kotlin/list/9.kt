package list

fun main(){
    val vals = listOf(1,2,0,5,-4,5,-6,7,8,3)

    val r = vals.find { isNegative(it) }
    println(r)

    //-----------
    // kotlin anonymous predicate
    val r2 = vals.find { e -> e < 0 }
    println(r2)

    //---------------
    val r3 = vals.find { it < 0 }
    println(r3)

}
