package set

//set contains
fun main(){
    val nums = setOf(4,5,3,2,1,-1,7,6,-8,9,-12)

    val r = nums.contains(4)

    if (r) println("the set contains 4")
    else println("the set does not contain 4")

    val r2 = nums.containsAll(setOf(1,-1))

    if (r2) println("the set contains -1 and 1")
    else println("the set does not contain -1 and 1")
}