package array

fun main(){
    val nums = intArrayOf(1,2,3,4,5,6,7,8,9)

    val hasAllEvens = nums.all { it % 2 == 0 }

    if (hasAllEvens) {
        println("the array contains only even values")
    }else{
        println("the array contains odd values")
    }

    //-----------

    val nums2 = intArrayOf(1,2,3,4,5,6,7,8,9)

    val hasEvenVals = nums2.any { it % 2 == 0}

    if (hasEvenVals) {
        println("the array contains even values")
    }else{
        println("the array does contain even values")
    }
}