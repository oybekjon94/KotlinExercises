package set

// set  fold
fun main(){
    val expenses = setOf(20,40,80,15,25)
    val cash = 550

    val res = expenses.fold(cash){total, next -> total - next}
    println(res)
}