package practice

fun doProcess(vals: List<Int>, f: (Int) -> Int) {
    val processed = vals.map { e -> f(e)}
    println(processed)
}

fun main(){
    val vals1 = listOf(1,2,3,4,5,6)

    val inc = {e: Int -> e+1}
    val dec = {e: Int -> e-1}
    val square = {e: Int -> e*e}
    val triple = {e: Int -> e*e*e}

    doProcess(vals1, inc)
    doProcess(vals1, dec)
    doProcess(vals1, square)
    doProcess(vals1, triple)
}