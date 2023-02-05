package array

fun main(){
//    val nums = arrayOf(1,2,3,4,5,6)
//
//    val res = nums.map{e -> e * 2}
//    println(res)
    //--------------------

    val nums  = intArrayOf(2,3,4,5,6,7)
    println("there are ${nums.count()} elements in the array")
    val nOfEvens = nums.count{it % 2 == 0}
    println("there are $nOfEvens even values in the array")
}