package flow

import java.util.*
import kotlin.random.Random as Random1

// when expression
fun main(){
    val r:Int = Random().nextInt(10) - 5

    when{
        r < 0 -> println("negative value")
        r == 0 -> println()
        r > 0 -> println("positive value")
    }
}