package set

//mutable Set
fun main(){
    val numbers  = arrayListOf(1,2,3,4)
    println(numbers.toList())

    val retainNumbers = arrayListOf(3,4)
    numbers.retainAll(retainNumbers.toSet())

    println("After retain all: ${numbers.toList()}")
    /*val nums = mutableSetOf(3,4,5)

    nums.add(6)
    nums.add(7)
    nums.addAll(setOf(8,9,10))

    println(nums)

    nums.remove(10)

    println(nums)

    val result = nums.retainAll(setOf())

    println(result)

    nums.clear()

    if (nums.isEmpty()) println("the set is eempty")
    else println("the set is not empty")*/
}