package lambdas

//mapIndex
fun main(){
    val list = listOf('a','b','c')
    var mapIndexed = list.mapIndexed { index, element -> "[$index: $element]" }
    println(mapIndexed)

    //you can ignore element using an underscore
    val list2 = listOf('a','b','c')
    var mapIndexed2 = list2.mapIndexed { index, _ -> "[$index]" }
    println(mapIndexed2)
}