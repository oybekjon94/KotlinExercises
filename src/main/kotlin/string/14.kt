package string

//kotlin string padding
fun main(){
    val nums = intArrayOf(543,453,4343,344,43,43)
    nums.toList().forEach{ e -> println(e.toString().padStart(20, '.')) }
}