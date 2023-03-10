package set

//set any
fun main(){
    val nums = setOf(4,5,3,2,-1,7,6,8,9)

    val r = nums.any{ e -> e > 10}
    if (r) println("there is a value greater than ten")
    else println("there is no value greater than ten")

    val r2 = nums.any{ e -> e < 0}
    if (r2) println("there is a negative value")
    else println("there is no negative value")
}