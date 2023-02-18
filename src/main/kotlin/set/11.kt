package set

//set map
fun main(){
    val nums = setOf(1,2,3,4,5,6)

    val nums2 = nums.map { e -> e * 2 }
    println(nums2)
}