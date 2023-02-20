package lambdas

fun main(){
    //tha lambda argument is the element index:
    val list1 = List(10) {it}
    println(list1)
    //A list of single value
    val list2 = List(10) {0}
    println(list2)
    //A list of letters
    val list3 = List(10){'a' + it}
    println(list3)
    //cycle through a sequence
    val list4 = List(10){ list3[it%3] }
    println(list4)
}