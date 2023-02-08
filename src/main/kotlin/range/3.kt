package range

fun main(){
    (1..5).forEach(::println)

    (1..5).reversed().forEach{ e -> print("$e") }
}