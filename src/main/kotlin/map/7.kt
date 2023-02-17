package map

// kotlin contains key / value
fun main(){
    val items = mapOf("coins" to 12, "books" to 45,"cups" to 33,"pens" to 2)

    if(items.containsKey("cups")){
        println("contains cups")
    }else{
        println("does not contain cups")
    }

    val value = 25

    if (items.containsValue(value)){
        println("contains value $value")
    }else{
        println("does not contain value $value")
    }
}