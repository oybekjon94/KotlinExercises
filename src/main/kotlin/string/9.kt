package string

import kotlin.math.ln

// kotlin string looping
fun main(){
    val phrase = "young eagle"
    for (e in phrase){
        print("$e")
    }
    println()

    phrase.forEach { e -> print("%#x ".format(e.toByte())) }

    println()

    phrase.forEachIndexed { idx, e -> println("phrase[$idx]=$e") }
}