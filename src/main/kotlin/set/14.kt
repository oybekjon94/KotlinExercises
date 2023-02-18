package set

//set chunked
fun main(){
    val nums = setOf(1,2,3,4,5,6)

    val res = nums.chunked(2).fold(0){total, next -> total + next[0] * next[1]}
    println(res)
}