package list

// kotlin filter predicate
fun main(){
    val vals = listOf(1,2,0,5,-4,5,-6,7,8,3)

    val r1 = vals.filter { it < 0 }
    println(r1)

    val r2 = vals.filter { it > 0 }
    println(r2)
}