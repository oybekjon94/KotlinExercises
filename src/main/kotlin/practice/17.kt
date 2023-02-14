package practice

fun main(){
    val nums  = listOf(4,5,3,2,1,7,8,9)

    val sum = nums.reduce { total, next -> total + next }
    println(sum)

    val colors = listOf("red","green","white","blue","black")

    val res = colors.reduceRight{next, total -> "$total-$next"}
    println(res)
}