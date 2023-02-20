package lambdas

fun main(){
    val list = listOf('a','b','c')
    val a = list.indices.map { "[$it]" }
    println(a)
    //lambdas can have zero parameters
    //run { -> trace("A lambdas") }
}