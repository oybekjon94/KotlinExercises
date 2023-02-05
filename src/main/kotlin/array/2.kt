package array

import java.util.*

//fun main(){
//    val nums = intArrayOf(1,2,3,4,5)
//
//    println(nums[2])
//
//    nums[0] = 11
//    println(nums[0])
//}
//-----------------------------
fun main(){
    val nums = arrayOf(1,2,3,4,5)
    println(nums.get(0))

    nums[0] = 0
    println(nums.toList())

    val nums2 = nums.plus(1)
    println(Arrays.toString(nums2))

    val slice = nums.sliceArray(1..3)
    println(Arrays.toString(slice))

    println(nums.first())
    println(nums.last())
    println(nums.indexOf(5))
}
