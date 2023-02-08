package array

fun main(){
    val nums = arrayOf(1,2,3,4,5,6)
    nums.forEach({ e-> print("$e ") })
    println()
    nums.forEachIndexed({i, e-> println("nums[$i] = $e") })
    for(e in nums){
        print("$e")
    }
    println()
    val it: Iterator<Int> = nums.iterator()
    while (it.hasNext()){
        val e = it.next()
        print("$e ")
    }
}