package array

fun main(){
    val nums = intArrayOf(1,2,3,4,5)

    val avg = nums.average()
    println("the average is $avg")

    val nOfValues = nums.count()
    println("there are $nOfValues elements")

    val sumOfValues = nums.sum()
    println("the sum of values is $sumOfValues")

    val maxValue = nums.max()
    println("the maximum is $maxValue")

    val minValue = nums.min()
    println("the minimum is $minValue")

}