package set

//set basics
fun main(){
    val nums = setOf(11,5,3,8,1,9,6,2)

    val len = nums.count()
    val max = nums.max()
    val min = nums.min()
    val sum = nums.sum()
    val avg = nums.average()

    val msg = """
        max: $max, min:$min,
        count: $len, sum:$sum,
        average: $avg
    """
        println(msg.trimIndent())
}