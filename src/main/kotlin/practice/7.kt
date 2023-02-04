package practice

//fun main(){
//    val age = 40
//
//    when (age){
//        in 0..4 -> println("children")
//        in 15..24 -> println("youth")
//        in 25..64 -> println("adults")
//        in 65..120 -> println("seniors")
//        in 120..130 -> println("unlikely age")
//        else -> println("wrong age value")
//    }
// }
    //--------------------------
//    enum class Season{
//        SPRING, SUMMER, AUTUMN, WINTER
//    }
//
//    fun main(){
//        val season =  Season.SUMMER
//
//        when(season){
//            Season.SPRING -> println("it is spring")
//            Season.SUMMER -> println("it is summer")
//            Season.AUTUMN -> println("it is autumn")
//            Season.WINTER -> println("it is winter")
//        }
//    }
    //----------------------------------
fun main(){
    val data = listOf<Any>("Sparrow",12,true, intArrayOf(1,2,3),12.2)

    data.forEach { e ->
        when(e){
            is String -> println("$e is a string")
            is Int -> println("$e is a integer")
            is Boolean -> println("$e is a boolean")
            is IntArray -> println("[${e.joinToString() }] is an array of integer")
            is Double -> println("$e is a double")
            else -> println("$e is unknown")
        }
    }
}
