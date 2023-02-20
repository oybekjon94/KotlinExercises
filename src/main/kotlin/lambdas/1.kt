package lambdas

fun main(){
    val list = listOf(1,2,3,4)
    val result = list.map({ n -> "[$n]"})
    //n is an Int because the lambda is being used with a list<Int>
    val result2 = list.map ({"[$it]"})
    //if there’s only a single parameter, Kotlin generates the name it for that parameter,
    //which means we no longer need the n ->
    println(result)
    println(result2)
}