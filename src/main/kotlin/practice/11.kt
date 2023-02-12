package practice

fun main(){
    val square: (Int) -> Int = { e : Int -> e*e} // full type declaration
    val square2 = { e : Int -> e * e}
    val square3: (Int) -> Int = { e -> e * e}

    val r1 = square(5)
    val r2 = square2(3)
    val r3 = square3(3)

    println(r1)
    println(r2)
    println(r3)
}