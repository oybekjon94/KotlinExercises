package list

fun main(){
    val nums = listOf(4, -5,3,2,-1,7,-6,8,9)

    val (nums2, nums3) = nums.partition { e -> e > 0 }
    println(nums2)
    println(nums3)
}