package set

//list take
fun main(){
    val nums = setOf(4,5,3,2,-1,7,6,8,9)

    val nums2 = nums.take(3)
    println(nums2)

    val nums3 = nums.sorted().take(3)
    println(nums3)

    val nums4 = nums.takeWhile { e -> e > 0 }
    println(nums4)

     val nums5 = nums.sortedDescending().takeWhile { e -> e > 0 }
    println(nums5)

    val nums6 = nums.takeIf { e -> e.contains(9) }
    println(nums6)
}