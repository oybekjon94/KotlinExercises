package function

fun callMe(){
    println("printing from callMe() function")
    println("this is cool (still printing from inside")
}
fun main(){
    callMe()
    println("printing outside from callMe() function")
}