package list

fun main(){
    val nums = listOf(1,2,3,4,5,6,7,8)

    val res = nums.groupBy { if (it%2==0) "even" else "odd" }
    println(res)

    val words = listOf("as","pen","cup","doll","my","spectacless")

    val res2 = words.groupBy { it.length }
    println(res2)

}