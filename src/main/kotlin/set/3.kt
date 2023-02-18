package set

//set indexing
fun main(){
    val words = setOf("pen","cup","dog","person",
    "cement","coal","spectacles","cup","bread")

    val w1 = words.elementAt(0)
    println(w1)

    val i1 = words.indexOf("cup")
    println("the first index of cup is $i1")

    val i2 = words.lastIndexOf("cup")
    println("the last index of cup is $i2")
}