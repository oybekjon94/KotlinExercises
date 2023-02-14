package list

fun main(){
    val expenses = listOf(20,40,80,15,25)

    val cash = 550

    val res = expenses.fold(cash) {total, next -> total - next}
    println(res)
}