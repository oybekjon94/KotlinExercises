package range

fun main(){
    for (c in 'a'..'k')
        print("$c")

    println()

    for (c in 'k' downTo 'a')
        print("$c")
}