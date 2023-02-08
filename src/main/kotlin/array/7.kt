package array

import java.util.*

fun main(){
    val nums = arrayOf(7,2,4,5,8,4)
    val sortedNums = nums.sortedArray()
    println(Arrays.toString(sortedNums))
    val sortedNumsDesc = nums.sortedArrayDescending()
    println(Arrays.toString(sortedNumsDesc))
}