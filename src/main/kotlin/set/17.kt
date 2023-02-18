package set

//set all
fun main(){
    val nums = setOf(4,5,3,2,-1,7,6,8,9)
    val nums2 = setOf(-3,-4,-2,-5,-7,-8)

    //testing for positive only values
    val r = nums.all { e -> e > 0 }

    if (r) println("nums set contains only positive values")
    else println("nums set does not contain only positive values")

    //testing for negative only values
    val r2 = nums2.all { e -> e < 0 }

    if (r2) println("nums2 set contain only negative values")
    else println("nums2 set does not contain only negative values")
}