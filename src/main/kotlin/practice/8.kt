package practice

//fun main(){
//    val vals = intArrayOf(-2, -1, 0,1 ,2,3,5)
//
//    //val filtered = vals.filter(fun(e) = e > 0)
//    val filtered = vals.filter{e -> e > 0}
//    println(filtered)
    //--------------
//    val l1 = { println("hello there")}
//    val l2: (String) -> Unit = {name: String ->
//        println("hello $name")
//    }
//    l1()
//    l2("Lucia")
    //------------------------
//    val nums = listOf(1,2,3,4,5,6)
//    nums.forEach{ print(it * 2) }
// }
    //------------------------
    val check = { u:Pair<String, Int> ->
        when(u.second){
            in 0..75 -> "failed"
            else -> "passed"
        }
    }
fun main(){
    val students = listOf(
        Pair("Maria", 98),
        Pair("Pablo", 81),
        Pair("Lucia", 45),
        Pair("Peter", 98),
        Pair("Simon", 73),
    )
    students.forEach{
        val res = check(it)
        println("${it.first} has $res")
    }
}
