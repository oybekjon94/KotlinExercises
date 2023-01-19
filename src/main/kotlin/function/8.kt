package function

//A function with one Int parametr , and Int return type
fun myFunction(x:Int):Int{
    return (x+5)
}
fun main(){
    var result = myFunction(3)
    println(result)
}