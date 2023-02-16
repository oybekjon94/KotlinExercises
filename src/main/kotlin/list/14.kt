package list

//filterNot
fun main(){
    val vals = listOf(1,2,0,5,-4,5,-6,7,8,3)

    val res = vals.filterNot { it > 0 }
    println(res)

    val res2 = vals.filterNot { it in listOf(0,5,4) }
    println(res2)
}