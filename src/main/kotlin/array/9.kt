package array

fun main(){
    val nums = arrayOf(1,-2,3,4,-5,6)
    nums.filter { e -> e > 0 }.forEach{ e -> print("$e ") }
    // output : 1 3 4 6
    println()
    nums.filter { e -> e < 0 }.forEach{ e -> print("$e ") }
    // output : -2 -5
}