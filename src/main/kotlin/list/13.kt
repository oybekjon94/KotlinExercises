package list

// kotlin filter list
fun main(){
    val vals = listOf(1,2,0,5,-4,5,-6,7,8,3)

    val res = vals.filter { e -> e > 0 }
    println(res)

    val res2 = vals.filter { e -> e < 0 }
    println(res2)
}