package set

//set union

fun main(){
    val nums = setOf(1,2,3) //setOf->factory function
    val nums2 = setOf(3,4,5)

    val nums3 = nums.union(nums2)

    println(nums3)
}