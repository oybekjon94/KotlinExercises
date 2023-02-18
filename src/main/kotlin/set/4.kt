package set

// set count
fun main(){
    val nums = setOf(4,5,3,2,1,-1,7,6,-8,9,-12)

    val len = nums.count()
    println("there are $len elements")

    val size = nums.size
    println("the size of the set is $size")

    val n1 = nums.count{ e -> e < 0}
    println("there are $n1 negative values")

    val n2 = nums.count{ e -> e % 2 == 0}
    println("there are $n2 even values")
}