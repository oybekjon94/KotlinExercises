package lambdas

fun main(){
    val mutableList1 = MutableList(5,{10 *( it + 1 )})
    println(mutableList1)
    val mutableList2 = MutableList(5){10*(it+1)}
    println(mutableList2)
}